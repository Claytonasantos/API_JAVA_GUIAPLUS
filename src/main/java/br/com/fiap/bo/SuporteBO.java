package br.com.fiap.bo;
import br.com.fiap.beans.Suporte;
import br.com.fiap.dao.SuporteDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class SuporteBO {
    SuporteDAO suporteDAO;

    // Selecionar
    public ArrayList<Suporte> selecionarSuporteBo() throws SQLException, ClassNotFoundException {
        suporteDAO = new SuporteDAO();

        // Regra de negócio
        return (ArrayList<Suporte>) suporteDAO.selecionarSuporte();
    }

    // Inserir
    public void inserirSuporteBo(Suporte suporte) throws SQLException, ClassNotFoundException {
        SuporteDAO suporteDao = new SuporteDAO();

        // Regra de negócios
        suporteDao.inserirSuporte(suporte);
    }

    // Atualizar
    public void atualizarSuporteBo(Suporte suporte) throws SQLException, ClassNotFoundException {
        SuporteDAO suporteDao = new SuporteDAO();

        // Regra de negócios

        suporteDao.atualizarSuporte(suporte);
    }

    // Deletar
    public void deletarSuporteBo(int id_suporte) throws SQLException, ClassNotFoundException {
        SuporteDAO suporteDao = new SuporteDAO();

        //Regra de negócios
        suporteDao.deletarSuporte(id_suporte);
    }
}
