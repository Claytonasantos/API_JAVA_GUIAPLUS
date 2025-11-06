package br.com.fiap;

import br.com.fiap.beans.Tutorial_video;
import br.com.fiap.bo.TutorialVideoBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider

@Path("/tutovideo")
public class TutoVideoResource {
    private TutorialVideoBO tutorialVideoBO = new TutorialVideoBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Tutorial_video> selecionarTutoVideoRs() throws ClassNotFoundException, SQLException {
        return  (ArrayList<Tutorial_video>)  tutorialVideoBO.selecionarTutoVideoBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirTutoVideoRs(Tutorial_video tutorialVideo, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
        tutorialVideoBO.inserirTutoVideoBo(tutorialVideo);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(tutorialVideo.getId_tutorial()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarTutoVideoRs(Tutorial_video tutorialVideo, @PathParam("id_tutorial") int id_tutorial) throws ClassNotFoundException, SQLException {
        tutorialVideoBO.atualizarTutoVideoBo(tutorialVideo);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_tutorial}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarTutoVideoRs(@PathParam("id_tutorial") int id_tutorial) throws ClassNotFoundException, SQLException {
        tutorialVideoBO.deletarTutoVideoBo(id_tutorial);
        return Response.ok().build();
    }
}
