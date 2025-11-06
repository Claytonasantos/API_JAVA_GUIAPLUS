package br.com.fiap.dao;

import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public Connection minhaConexao;

    public UsuarioDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    //insert
    public String inserir(Usuario usuario) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into usuario (cpf_usuario, nome_usuario, data_nasc) values (?, ?, ?)");
                stmt.setString(1,usuario.getCpf());
                stmt.setString(2,usuario.getNome());
                java.sql.Date sqlDate = new java.sql.Date(usuario.getDataNascimento().getTime());
                stmt.setDate(3, sqlDate);

                stmt.execute();
                stmt.close();

                return "Usuario inserido com sucesso!";
    }

    //Deletar
    public String deletar(Integer id_usuario) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Delete from usuario where id_usuario = ?");
        stmt.setInt(1, id_usuario);
        stmt.execute();
        stmt.close();

        return "Usuario deletado com sucesso!";
    }

    //Update
    public String atualizar (Usuario usuario) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("Update usuario set cpf_usuario = ?, nome_usuario = ?, data_nasc = ? where id_usuario = ?");
        stmt.setString(1, usuario.getCpf());
        stmt.setString(2,usuario.getNome());
        java.sql.Date sqlDate = new java.sql.Date(usuario.getDataNascimento().getTime());
        stmt.setDate(3, sqlDate);
        stmt.setInt(4,usuario.getId_usuario());

        stmt.executeUpdate();
        stmt.close();

        return "Usuario atualizado com sucesso!";
    }

    // Select
    public List<Usuario> selecionarUsuario() throws SQLException {
        ArrayList<Usuario> listUsuario = new ArrayList<Usuario>();

        PreparedStatement stmt = minhaConexao.prepareStatement("select id_usuario, cpf_usuario, nome_usuario, data_nasc from usuario");

        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            Usuario objUsuario = new Usuario();
            objUsuario.setId_usuario(rs.getInt(1));
            objUsuario.setCpf(rs.getString(2));
            objUsuario.setNome(rs.getString(3));
            objUsuario.setDataNascimento(rs.getDate(4));
            listUsuario.add(objUsuario);
        }
        return listUsuario;
    }
}
