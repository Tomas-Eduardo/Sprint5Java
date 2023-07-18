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


public class ListarUsuarios extends HttpServlet {
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();

        List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();

        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("Listar_usuarios.jsp").forward(request, response);


    }
}

