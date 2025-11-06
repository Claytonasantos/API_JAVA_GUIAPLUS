package br.com.fiap.bo;

import br.com.fiap.beans.Lembrete;
import br.com.fiap.dao.LembreteDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class LembreteBO {
    LembreteDAO lembreteDAO;

    // Selecionar
    public ArrayList<Lembrete> selecionarLembreteBo() throws SQLException, ClassNotFoundException {
        lembreteDAO = new LembreteDAO();

        // Regra de negócio
        return (ArrayList<Lembrete>) lembreteDAO.selecionarLemrete();
    }

    // Inserir
    public void inserirLembreteBo(Lembrete lembrete) throws SQLException, ClassNotFoundException {
        LembreteDAO lembreteDao = new LembreteDAO();

        // Regra de negócios
        lembreteDao.inserirLembrete(lembrete);
    }

    // Atualizar
    public void atualizarLembreteBo(Lembrete lembrete) throws SQLException, ClassNotFoundException {
        LembreteDAO lembreteDao = new LembreteDAO();

        // Regra de negócios

        lembreteDao.atualizarLembrete(lembrete);
    }

    // Deletar
    public void deletarLembreteBo(int id_lembrete) throws SQLException, ClassNotFoundException {
        LembreteDAO lembreteDao = new LembreteDAO();

        //Regra de negócios
        lembreteDao.deletarLembrete(id_lembrete);
    }
}
