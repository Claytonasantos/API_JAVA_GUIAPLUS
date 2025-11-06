package br.com.fiap;


import br.com.fiap.beans.CategoriaTutorial;
import br.com.fiap.bo.CategoriaBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider

@Path("/categoria")
public class CategoriaResource {
    private CategoriaBO categoriaBO = new CategoriaBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<CategoriaTutorial> selecionarCategoriaRs() throws ClassNotFoundException, SQLException {
        return  (ArrayList<CategoriaTutorial>)  categoriaBO.selecionarCategoriaBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirCategoriaRs(CategoriaTutorial categoriaTutorial, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
        categoriaBO.inserirCategoriaBo(categoriaTutorial);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(categoriaTutorial.getId_categoria()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarCategoriaRs(CategoriaTutorial categoriaTutorial, @PathParam("id_categoria") int id_categoria) throws ClassNotFoundException, SQLException {
        categoriaBO.atualizarCategoriaBo(categoriaTutorial);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_categoria}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarCategoriaRs(@PathParam("id_categoria") int id_categoria) throws ClassNotFoundException, SQLException {
        categoriaBO.deletarCategoriaBo(id_categoria);
        return Response.ok().build();
    }
}
