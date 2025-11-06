package br.com.fiap;

import br.com.fiap.beans.Perfil;
import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.PerfilBO;
import br.com.fiap.bo.UsuarioBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider

@Path("/perfil")
public class PerfilResource {
    private PerfilBO perfilBO = new PerfilBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Perfil> selecionarPerfilRs() throws ClassNotFoundException, SQLException {
        return  (ArrayList<Perfil>)  perfilBO.selecionarPerfilBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirPerfilRs(Perfil perfil, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
        perfilBO.inserirPerfilBo(perfil);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(perfil.getId_perfil()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarPerfilRs(Perfil perfil, @PathParam("id_perfil") int id_perfil) throws ClassNotFoundException, SQLException {
        perfilBO.atualizarPerfilBo(perfil);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_perfil}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarPerfilRs(@PathParam("id_perfil") int id_perfil) throws ClassNotFoundException, SQLException {
        perfilBO.deletarPerfilBo(id_perfil);
        return Response.ok().build();
    }
}
