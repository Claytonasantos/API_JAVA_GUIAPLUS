package br.com.fiap.bo;

import br.com.fiap.beans.CategoriaTutorial;
import br.com.fiap.dao.CategoriaDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaBO {
    CategoriaDAO categoriaDAO;

    // Selecionar
    public ArrayList<CategoriaTutorial> selecionarCategoriaBo() throws SQLException, ClassNotFoundException {
        categoriaDAO = new CategoriaDAO();

        // Regra de negócio
        return (ArrayList<CategoriaTutorial>) categoriaDAO.selecionarCategoria();
    }

    // Inserir
    public void inserirCategoriaBo(CategoriaTutorial categoriaTutorial) throws SQLException, ClassNotFoundException {
        CategoriaDAO categoriaDao = new CategoriaDAO();

        // Regra de negócios
        categoriaDao.inserirCategoria(categoriaTutorial);
    }

    // Atualizar
    public void atualizarCategoriaBo(CategoriaTutorial categoriaTutorial) throws SQLException, ClassNotFoundException {
        CategoriaDAO categoriaDao = new CategoriaDAO();

        // Regra de negócios

        categoriaDao.atualizarCategoria(categoriaTutorial);
    }

    // Deletar
    public void deletarCategoriaBo(int id_categoria) throws SQLException, ClassNotFoundException {
        CategoriaDAO categoriaDao = new CategoriaDAO();

        //Regra de negócios
        categoriaDao.deletarCategoria(id_categoria);
    }
}
