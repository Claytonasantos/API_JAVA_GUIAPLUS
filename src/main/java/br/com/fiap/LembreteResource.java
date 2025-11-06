package br.com.fiap;

import br.com.fiap.beans.Lembrete;
import br.com.fiap.bo.LembreteBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider

@Path("/lembrete")
public class LembreteResource {
    private LembreteBO lembreteBO = new LembreteBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Lembrete> selecionarLembreteRs() throws ClassNotFoundException, SQLException {
        return  (ArrayList<Lembrete>)  lembreteBO.selecionarLembreteBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirLembreteRs(Lembrete lembrete, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
        lembreteBO.inserirLembreteBo(lembrete);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(lembrete.getId_lembrete()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarLembreteRs(Lembrete lembrete, @PathParam("id_lembrete") int id_lembrete) throws ClassNotFoundException, SQLException {
        lembreteBO.atualizarLembreteBo(lembrete);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_lembrete}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarLembreteRs(@PathParam("id_lembrete") int id_lembrete) throws ClassNotFoundException, SQLException {
        lembreteBO.deletarLembreteBo(id_lembrete);
        return Response.ok().build();
    }
}
