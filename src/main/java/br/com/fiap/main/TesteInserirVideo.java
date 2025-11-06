package br.com.fiap.main;

import br.com.fiap.beans.CategoriaTutorial;
import br.com.fiap.beans.Tutorial_video;
import br.com.fiap.dao.CategoriaDAO;
import br.com.fiap.dao.TutorialVideoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserirVideo {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        TutorialVideoDAO tutorialVideoDAO = new TutorialVideoDAO();
        Tutorial_video objTutorialVideo = new Tutorial_video();

        objTutorialVideo.setTitulo(texto("Titulo do video"));
        objTutorialVideo.setUrl(texto("Link do video"));
        objTutorialVideo.setTipo_tutorial(texto("Tipo de tutorial (TEXTO OU VIDEO)"));

        System.out.println(tutorialVideoDAO.inserirVideoTutorial(objTutorialVideo));
    }
}
