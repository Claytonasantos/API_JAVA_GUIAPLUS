package br.com.fiap.main;

import br.com.fiap.beans.CategoriaTutorial;
import br.com.fiap.beans.Tutorial_video;
import br.com.fiap.dao.CategoriaDAO;
import br.com.fiap.dao.TutorialVideoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarVideo {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        TutorialVideoDAO tutorialVideoDAO = new TutorialVideoDAO();
        Tutorial_video objTutorialVideo = new Tutorial_video();

        objTutorialVideo.setId_tutorial(inteiro("Informe o ID do tutorial que vai ser deletado"));

        System.out.println(tutorialVideoDAO.deletarVideoTutorial(objTutorialVideo.getId_tutorial()));
    }
}
