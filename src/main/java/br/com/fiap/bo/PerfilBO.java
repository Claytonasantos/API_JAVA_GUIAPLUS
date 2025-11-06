package br.com.fiap.bo;

import br.com.fiap.beans.Lembrete;
import br.com.fiap.beans.Perfil;
import br.com.fiap.dao.PerfilDAO;


import java.sql.SQLException;
import java.util.ArrayList;

public class PerfilBO {
    PerfilDAO perfilDAO;

    // Selecionar
    public ArrayList<Perfil> selecionarPerfilBo() throws SQLException, ClassNotFoundException {
        perfilDAO = new PerfilDAO();

        // Regra de negócio
        return (ArrayList<Perfil>) perfilDAO.selecionarPerfil();
    }

    // Inserir
    public void inserirPerfilBo(Perfil perfil) throws SQLException, ClassNotFoundException {
        PerfilDAO perfilDao = new PerfilDAO();

        // Regra de negócios
        perfilDao.inserirPerfil(perfil);
    }

    // Atualizar
    public void atualizarPerfilBo(Perfil perfil) throws SQLException, ClassNotFoundException {
        PerfilDAO perfilDao = new PerfilDAO();

        // Regra de negócios

        perfilDao.atualizarPerfil(perfil);
    }

    // Deletar
    public void deletarPerfilBo(int id_perfil) throws SQLException, ClassNotFoundException {
        PerfilDAO perfilDao = new PerfilDAO();

        //Regra de negócios
        perfilDao.deletarPerfil(id_perfil);
    }
}
