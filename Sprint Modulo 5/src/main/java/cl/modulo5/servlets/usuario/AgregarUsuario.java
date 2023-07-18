
package cl.modulo5.servlets.usuario;

import java.io.IOException;

import cl.modulo5.daos.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;


public class AgregarUsuario extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipoSelect");

        UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();

        if (tipo != null) {
            if (tipo.equals("Administrativo")) {
                String area = request.getParameter("area");
                Administrativo administrativo = new Administrativo(0, nombre, tipo, area);
                usuarioDAO.agregarAdministrativo(administrativo);
            } else if (tipo.equals("Profesional")) {
                String titulo = request.getParameter("titulo");
                Profesional profesional = new Profesional(0, nombre, tipo, titulo);
                usuarioDAO.agregarProfesional(profesional);
            } else if (tipo.equals("Cliente")) {
                String empresa = request.getParameter("empresa");
                Cliente cliente = new Cliente(0, nombre, tipo, empresa);
                usuarioDAO.agregarCliente(cliente);
            }
        }

        request.setAttribute("mensaje", "El usuario ha sido registrado exitosamente.");
        request.getRequestDispatcher("MensajeRegistroUsuario.jsp").forward(request, response);
    }
}