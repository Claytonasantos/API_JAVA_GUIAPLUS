package br.com.fiap;

import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.UsuarioBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider

@Path("/usuario")
public class UsuarioResource {
    private UsuarioBO usuarioBO = new UsuarioBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Usuario> selecionarUsuRs() throws ClassNotFoundException, SQLException {
        return  (ArrayList<Usuario>)  usuarioBO.selecionarUsuarioBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirUsuRs(Usuario usuario, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
        usuarioBO.inserirusuarioBo(usuario);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(usuario.getId_usuario()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarUsuRs(Usuario usuario, @PathParam("id_usuario") int id_usuario) throws ClassNotFoundException, SQLException {
        usuarioBO.atualizarUsuarioBo(usuario);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/{id_usuario}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarUsuRs(@PathParam("id_usuario") int id_usuario) throws ClassNotFoundException, SQLException {
        usuarioBO.deletarUsuarioBo(id_usuario);
        return Response.ok().build();
    }

}
