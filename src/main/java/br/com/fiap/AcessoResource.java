package br.com.fiap;

import br.com.fiap.beans.Acesso;

import br.com.fiap.bo.AcessoBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider

@Path("/acesso")
public class AcessoResource {
    private AcessoBO acessoBO = new AcessoBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Acesso> selecionarAcessoRs() throws ClassNotFoundException, SQLException {
        return  (ArrayList<Acesso>)  acessoBO.selecionarAcessoBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirAcessoRs(Acesso acesso, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
        acessoBO.inserirAcessoBo(acesso);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(acesso.getId_acesso()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarAcessoRs(Acesso acesso, @PathParam("id_acesso") int id_acesso) throws ClassNotFoundException, SQLException {
        acessoBO.atualizarAcessoBo(acesso);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_acesso}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarAcessoRs(@PathParam("id_acesso") int id_acesso) throws ClassNotFoundException, SQLException {
        acessoBO.deletarAcessoBo(id_acesso);
        return Response.ok().build();
    }
}
