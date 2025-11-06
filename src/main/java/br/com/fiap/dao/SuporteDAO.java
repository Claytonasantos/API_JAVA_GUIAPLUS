package br.com.fiap.dao;

import br.com.fiap.beans.Lembrete;
import br.com.fiap.beans.Perfil;
import br.com.fiap.beans.Suporte;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuporteDAO {
    public Connection minhaConexao;

    public SuporteDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    //insert
    public String inserirSuporte(Suporte suporte) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into suporte (duvida) values (?)");
        stmt.setString(1,suporte.getPergunta());

        stmt.execute();
        stmt.close();

        return "Duvida inserida com sucesso!";
    }

    //Deletar
    public String deletarSuporte(Integer id_suporte) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Delete from suporte where id_suporte = ?");
        stmt.setInt(1, id_suporte);
        stmt.execute();
        stmt.close();

        return "Duvida deletada com sucesso!";
    }

    //Update
    public String atualizarSuporte (Suporte suporte) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("Update suporte set duvida = ? where id_suporte = ?");
        stmt.setString(1, suporte.getPergunta());
        stmt.setInt(2, suporte.getId_suporte());

        stmt.executeUpdate();
        stmt.close();

        return "Duvida atualizada com sucesso!";
    }

    // Select
    public List<Suporte> selecionarSuporte() throws SQLException {
        ArrayList<Suporte> listSuporte = new ArrayList<Suporte>();

        PreparedStatement stmt = minhaConexao.prepareStatement("select * from suporte");

        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            Suporte objSuporte = new Suporte();
            objSuporte.setId_suporte(rs.getInt(1));
            objSuporte.setPergunta(rs.getString(2));
            listSuporte.add(objSuporte);
        }
        return listSuporte;
    }
}
