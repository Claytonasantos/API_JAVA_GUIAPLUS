package br.com.fiap;

import br.com.fiap.beans.Suporte;
import br.com.fiap.bo.SuporteBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider

@Path("/suporte")
public class SuporteResource {
    private SuporteBO suporteBO = new SuporteBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Suporte> selecionarSuporteRs() throws ClassNotFoundException, SQLException {
        return  (ArrayList<Suporte>)  suporteBO.selecionarSuporteBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirSuporteRs(Suporte suporte, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
        suporteBO.inserirSuporteBo(suporte);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(suporte.getId_suporte()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarSuporteRs(Suporte suporte, @PathParam("id_suporte") int id_suporte) throws ClassNotFoundException, SQLException {
        suporteBO.atualizarSuporteBo(suporte);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_suporte}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarSuporteRs(@PathParam("id_suporte") int id_suporte) throws ClassNotFoundException, SQLException {
        suporteBO.deletarSuporteBo(id_suporte);
        return Response.ok().build();
    }
}
