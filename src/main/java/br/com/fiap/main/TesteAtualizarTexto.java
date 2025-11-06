package br.com.fiap.main;

import br.com.fiap.beans.Tutorial_texto;
import br.com.fiap.beans.Tutorial_video;
import br.com.fiap.dao.TutorialTextoDAO;
import br.com.fiap.dao.TutorialVideoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteAtualizarTexto {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        TutorialTextoDAO tutorialTextoDAO = new TutorialTextoDAO();

        Tutorial_texto objTutorialTexto = new Tutorial_texto();

        objTutorialTexto.setId_tutorial(inteiro("Informe o Id do tutorial que será atualizado"));
        objTutorialTexto.setTipo_tutorial(texto("Informe o novo tipo de tutorial"));
        objTutorialTexto.setTextoTutorial(texto("Informe o texto que sera atualizado"));




        System.out.println(tutorialTextoDAO.atualizarTextoTutorial(objTutorialTexto));
    }
}
