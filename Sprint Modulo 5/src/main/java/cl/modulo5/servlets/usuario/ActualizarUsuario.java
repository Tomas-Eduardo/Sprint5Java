package cl.modulo5.servlets.usuario;

import java.io.IOException;

import cl.modulo5.daos.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;


public class ActualizarUsuario extends HttpServlet {
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipo");

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre(nombre);
        usuario.setTipo(tipo);

        UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
        usuarioDAO.actualizarUsuario(usuario);

        response.sendRedirect("ListarUsuarios");
    }
}
