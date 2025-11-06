package br.com.fiap.bo;

import br.com.fiap.beans.Acesso;
import br.com.fiap.dao.AcessoDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class AcessoBO {

    AcessoDAO acessoDAO;

    // Selecionar
    public ArrayList<Acesso> selecionarAcessoBo() throws SQLException, ClassNotFoundException {
        acessoDAO = new AcessoDAO();

        // Regra de negócio
        return (ArrayList<Acesso>) acessoDAO.selecionar();
    }

    // Inserir
    public void inserirAcessoBo(Acesso acesso) throws SQLException, ClassNotFoundException {
        AcessoDAO acessoDao = new AcessoDAO();

        // Regra de negócios
        acessoDao.inserirAcesso(acesso);
    }

    // Atualizar
    public void atualizarAcessoBo(Acesso acesso) throws SQLException, ClassNotFoundException {
        AcessoDAO acessoDao = new AcessoDAO();

        // Regra de negócios

        acessoDao.atualizarAcesso(acesso);
    }

    // Deletar
    public void deletarAcessoBo(int id_acesso) throws SQLException, ClassNotFoundException {
        AcessoDAO acessoDao = new AcessoDAO();

        //Regra de negócios
        acessoDao.deletarAcesso(id_acesso);
    }
}
