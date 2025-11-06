package br.com.fiap.dao;

import br.com.fiap.beans.Acesso;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AcessoDAO {
    public Connection minhaConexao;

    public AcessoDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    //insert
    public String inserirAcesso(Acesso acesso) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into acesso (data_acesso) values (?)");
        java.sql.Date sqlDate = new java.sql.Date(acesso.getDataAcesso().getTime());
        stmt.setDate(1, sqlDate);

        stmt.execute();
        stmt.close();

        return "Acesso inserido com sucesso!";
    }

    //Deletar
    public String deletarAcesso(Integer id_acesso) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Delete from acesso where id_acesso = ?");
        stmt.setInt(1, id_acesso);
        stmt.execute();
        stmt.close();

        return "Acesso deletado com sucesso!";
    }

    //Update
    public String atualizarAcesso (Acesso acesso) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("Update acesso set data_acesso = ? where id_acesso = ?");
        java.sql.Date sqlDate = new java.sql.Date(acesso.getDataAcesso().getTime());
        stmt.setDate(1, sqlDate);
        stmt.setInt(2,acesso.getId_acesso());

        stmt.executeUpdate();
        stmt.close();

        return "Acesso atualizado com sucesso!";
    }

    // Select
    public List<Acesso> selecionar() throws SQLException {
        ArrayList<Acesso> listAcesso = new ArrayList<Acesso>();

        PreparedStatement stmt = minhaConexao.prepareStatement("select * from Acesso");

        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            Acesso objAcesso = new Acesso();
            objAcesso.setId_acesso(rs.getInt(1));
            objAcesso.setDataAcesso(rs.getDate(2));
            listAcesso.add(objAcesso);
        }
        return listAcesso;
    }
}
