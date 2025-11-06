package br.com.fiap.dao;


import br.com.fiap.beans.Tutorial_video;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TutorialVideoDAO {
    public Connection minhaConexao;

    public TutorialVideoDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    //insert
    public String inserirVideoTutorial(Tutorial_video tutorialVideo) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into tutoriais (titulo, url_video, tipo_tutorial) values (?, ?, ?)");
        stmt.setString(1,tutorialVideo.getTitulo());
        stmt.setString(2,tutorialVideo.getUrl());
        stmt.setString(3,tutorialVideo.getTipo_tutorial());

        stmt.execute();
        stmt.close();

        return "Video inserido com sucesso!";
    }

    //Deletar
    public String deletarVideoTutorial(Integer id_tutorial) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Delete from tutoriais where id_tutorial = ?");
        stmt.setInt(1, id_tutorial);
        stmt.execute();
        stmt.close();

        return "Video deletado com sucesso!";
    }

    //Update
    public String atualizarVideoTutorial(Tutorial_video tutorialVideo) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("Update tutoriais set titulo = ?, url_video = ?, tipo_tutorial = ? where id_tutorial = ?");
        stmt.setString(1, tutorialVideo.getTitulo());
        stmt.setString(2, tutorialVideo.getUrl());
        stmt.setString(3, tutorialVideo.getTipo_tutorial());
        stmt.setInt(4,tutorialVideo.getId_tutorial());

        stmt.executeUpdate();
        stmt.close();

        return "Video atualizado com sucesso!";
    }

    // Select
    public List<Tutorial_video> selecionarTutoVideo() throws SQLException {
        ArrayList<Tutorial_video> listTutoVideo = new ArrayList<Tutorial_video>();

        PreparedStatement stmt = minhaConexao.prepareStatement("select id_tutorial, titulo, url_video, tipo_tutorial from tutoriais");

        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            Tutorial_video objTutoVideo = new Tutorial_video();
            objTutoVideo.setId_tutorial(rs.getInt(1));
            objTutoVideo.setUrl(rs.getString(2));
            objTutoVideo.setTipo_tutorial(rs.getString(3));
            listTutoVideo.add(objTutoVideo);
        }
        return listTutoVideo;
    }
}
