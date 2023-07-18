package cl.modulo5.servlets.usuario;

import java.io.IOException;
import java.util.List;

import cl.modulo5.daos.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;


public class EditarUsuario extends HttpServlet {
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
        Usuario usuario = usuarioDAO.obtenerUsuarioPorId(id);

        request.setAttribute("usuario", usuario);
        request.getRequestDispatcher("Editar_usuario.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tipoUsuario = request.getParameter("tipo");

        UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
        List<Usuario> usuarios = usuarioDAO.obtenerUsuariosPorTipo(tipoUsuario);

        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("Listar_usuarios.jsp").forward(request, response);
    }
}

