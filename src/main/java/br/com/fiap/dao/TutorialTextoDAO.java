package br.com.fiap.dao;

import br.com.fiap.beans.Suporte;
import br.com.fiap.beans.Tutorial_texto;
import br.com.fiap.beans.Tutorial_video;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TutorialTextoDAO {
    public Connection minhaConexao;

    public TutorialTextoDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    //insert
    public String inserirTextoTutorial(Tutorial_texto tutorialTexto) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into tutoriais (tipo_tutorial, texto_tutorial) values (?, ?)");
        stmt.setString(1,tutorialTexto.getTipo_tutorial());
        stmt.setString(2,tutorialTexto.getTextoTutorial());

        stmt.execute();
        stmt.close();

        return "Texto inserido com sucesso!";
    }

    //Deletar
    public String deletarTextoTutorial(Integer id_tutorial) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Delete from tutoriais where id_tutorial = ?");
        stmt.setInt(1, id_tutorial);
        stmt.execute();
        stmt.close();

        return "Texto deletado com sucesso!";
    }

    //Update
    public String atualizarTextoTutorial(Tutorial_texto tutorialTexto) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("Update tutoriais set tipo_tutorial = ?, texto_tutorial = ? where id_tutorial = ?");
        stmt.setString(1, tutorialTexto.getTipo_tutorial());
        stmt.setString(2, tutorialTexto.getTextoTutorial());
        stmt.setInt(3,tutorialTexto.getId_tutorial());

        stmt.executeUpdate();
        stmt.close();

        return "Texto atualizado com sucesso!";
    }

    // Select
    public List<Tutorial_texto> selecionarTutoTexto() throws SQLException {
        ArrayList<Tutorial_texto> listTutoTexto = new ArrayList<Tutorial_texto>();

        PreparedStatement stmt = minhaConexao.prepareStatement("select id_tutorial, tipo_tutorial, texto_tutorial from tutoriais");

        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            Tutorial_texto objTutoTexto = new Tutorial_texto();
            objTutoTexto.setId_tutorial(rs.getInt(1));
            objTutoTexto.setTipo_tutorial(rs.getString(2));
            objTutoTexto.setTextoTutorial(rs.getString(3));
            listTutoTexto.add(objTutoTexto);
        }
        return listTutoTexto;
    }
}
