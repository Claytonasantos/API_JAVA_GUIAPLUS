package br.com.fiap.bo;

import br.com.fiap.beans.Tutorial_video;
import br.com.fiap.dao.TutorialVideoDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class TutorialVideoBO {
    TutorialVideoDAO tutorialVideoDAO;

    // Selecionar
    public ArrayList<Tutorial_video> selecionarTutoVideoBo() throws SQLException, ClassNotFoundException {
        tutorialVideoDAO = new TutorialVideoDAO();

        // Regra de negócio
        return (ArrayList<Tutorial_video>) tutorialVideoDAO.selecionarTutoVideo();
    }

    // Inserir
    public void inserirTutoVideoBo(Tutorial_video tutorialVideo) throws SQLException, ClassNotFoundException {
        TutorialVideoDAO tutorialVideoDao = new TutorialVideoDAO();

        // Regra de negócios
        tutorialVideoDao.inserirVideoTutorial(tutorialVideo);
    }

    // Atualizar
    public void atualizarTutoVideoBo(Tutorial_video tutorialVideo) throws SQLException, ClassNotFoundException {
        TutorialVideoDAO tutorialVideoDao = new TutorialVideoDAO();

        // Regra de negócios

        tutorialVideoDao.atualizarVideoTutorial(tutorialVideo);
    }

    // Deletar
    public void deletarTutoVideoBo(int id_tutorial) throws SQLException, ClassNotFoundException {
        TutorialVideoDAO tutorialVideoDao = new TutorialVideoDAO();

        //Regra de negócios
        tutorialVideoDao.deletarVideoTutorial(id_tutorial);
    }
}
