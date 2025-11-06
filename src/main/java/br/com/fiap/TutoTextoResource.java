package br.com.fiap;

import br.com.fiap.beans.Tutorial_texto;
import br.com.fiap.bo.TutorialTextoBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider

@Path("/tutotexto")
public class TutoTextoResource {
    private TutorialTextoBO tutorialTextoBO = new TutorialTextoBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Tutorial_texto> selecionarTutoTextoRs() throws ClassNotFoundException, SQLException {
        return  (ArrayList<Tutorial_texto>)  tutorialTextoBO.selecionarTutoTextoBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirTutoTextoRs(Tutorial_texto tutorialTexto, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
        tutorialTextoBO.inserirTutoTextoBo(tutorialTexto);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(tutorialTexto.getId_tutorial()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarTutoTextoRs(Tutorial_texto tutorialTexto, @PathParam("id_tutorial") int id_tutorial) throws ClassNotFoundException, SQLException {
        tutorialTextoBO.atualizarTutoTextoBo(tutorialTexto);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_tutorial}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarTutoTextoRs(@PathParam("id_tutorial") int id_tutorial) throws ClassNotFoundException, SQLException {
        tutorialTextoBO.deletarTutoTextoBo(id_tutorial);
        return Response.ok().build();
    }
}
