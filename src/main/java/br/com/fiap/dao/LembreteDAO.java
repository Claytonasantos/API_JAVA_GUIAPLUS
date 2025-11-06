package br.com.fiap.dao;

import br.com.fiap.beans.Acesso;
import br.com.fiap.beans.Lembrete;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LembreteDAO {
    public Connection minhaConexao;

    public LembreteDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    //insert
    public String inserirLembrete(Lembrete lembrete) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into lembretes (nome_lembrete, data_lembrete, desc_lembrete) values (?, ?, ?)");
        stmt.setString(1,lembrete.getNome());
        java.sql.Date sqlDate = new java.sql.Date(lembrete.getDataLembrete().getTime());
        stmt.setDate(2, sqlDate);
        stmt.setString(3,lembrete.getDescricaoLembrete());

        stmt.execute();
        stmt.close();

        return "Lembrete inserido com sucesso!";
    }

    //Deletar
    public String deletarLembrete(Integer id_lembrete) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Delete from lembretes where id_lembrete = ?");
        stmt.setInt(1, id_lembrete);
        stmt.execute();
        stmt.close();

        return "Lembrete deletado com sucesso!";
    }

    //update
    public String atualizarLembrete (Lembrete lembrete) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE lembretes SET nome_lembrete = ?, data_lembrete = ?, desc_lembrete = ? WHERE id_lembrete = ?"
        );
        stmt.setString(1, lembrete.getNome());
        java.sql.Date sqlDate = new java.sql.Date(lembrete.getDataLembrete().getTime());
        stmt.setDate(2, sqlDate);
        stmt.setString(3, lembrete.getDescricaoLembrete());
        stmt.setInt(4, lembrete.getId_lembrete());

        stmt.executeUpdate();
        stmt.close();

        return "Lembrete atualizado com sucesso!";
    }

    // Select
    public List<Lembrete> selecionarLemrete() throws SQLException {
        ArrayList<Lembrete> listLembrete = new ArrayList<Lembrete>();

        PreparedStatement stmt = minhaConexao.prepareStatement("select * from lembretes");

        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            Lembrete objLembrete = new Lembrete();
            objLembrete.setId_lembrete(rs.getInt(1));
            objLembrete.setNome(rs.getString(2));
            objLembrete.setDataLembrete(rs.getDate(3));
            objLembrete.setDescricaoLembrete(rs.getString(4));
            listLembrete.add(objLembrete);
        }
        return listLembrete;
    }
}
