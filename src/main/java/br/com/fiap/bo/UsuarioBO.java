package br.com.fiap.bo;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioBO {
    UsuarioDAO usuarioDAO;

    // Selecionar
    public ArrayList<Usuario> selecionarUsuarioBo() throws SQLException, ClassNotFoundException {
        usuarioDAO = new UsuarioDAO();

        // Regra de negócio
        return (ArrayList<Usuario>) usuarioDAO.selecionarUsuario();
    }

    // Inserir
    public void inserirusuarioBo(Usuario usuario) throws SQLException, ClassNotFoundException {
        UsuarioDAO tutorialVideoDao = new UsuarioDAO();

        // Regra de negócios
        usuarioDAO.inserir(usuario);
    }

    // Atualizar
    public void atualizarUsuarioBo(Usuario usuario) throws SQLException, ClassNotFoundException {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        // Regra de negócios

        usuarioDao.atualizar(usuario);
    }

    // Deletar
    public void deletarUsuarioBo(int id_usuario) throws SQLException, ClassNotFoundException {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        //Regra de negócios
        usuarioDao.deletar(id_usuario);
    }
}
