package br.com.fiap.bo;

import br.com.fiap.beans.Tutorial_texto;
import br.com.fiap.dao.TutorialTextoDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class TutorialTextoBO {
    TutorialTextoDAO tutorialTextoDAO;

    // Selecionar
    public ArrayList<Tutorial_texto> selecionarTutoTextoBo() throws SQLException, ClassNotFoundException {
        tutorialTextoDAO = new TutorialTextoDAO();

        // Regra de negócio
        return (ArrayList<Tutorial_texto>) tutorialTextoDAO.selecionarTutoTexto();
    }

    // Inserir
    public void inserirTutoTextoBo(Tutorial_texto tutorialTexto) throws SQLException, ClassNotFoundException {
        TutorialTextoDAO tutorialTextoDao = new TutorialTextoDAO();

        // Regra de negócios
        tutorialTextoDao.inserirTextoTutorial(tutorialTexto);
    }

    // Atualizar
    public void atualizarTutoTextoBo(Tutorial_texto tutorialTexto) throws SQLException, ClassNotFoundException {
        TutorialTextoDAO tutorialTextoDao = new TutorialTextoDAO();

        // Regra de negócios

        tutorialTextoDao.atualizarTextoTutorial(tutorialTexto);
    }

    // Deletar
    public void deletarTutoTextoBo(int id_tutorial) throws SQLException, ClassNotFoundException {
        TutorialTextoDAO tutorialTextoDao = new TutorialTextoDAO();

        //Regra de negócios
        tutorialTextoDao.deletarTextoTutorial(id_tutorial);
    }
}
