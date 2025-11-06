package br.com.fiap.main;

import br.com.fiap.beans.CategoriaTutorial;
import br.com.fiap.dao.CategoriaDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarCategoria {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        CategoriaTutorial objCategoria = new CategoriaTutorial();

        objCategoria.setId_categoria(inteiro("Informe o ID da categoria que vai ser deletada"));

        System.out.println(categoriaDAO.deletarCategoria(objCategoria.getId_categoria()));

    }
}
