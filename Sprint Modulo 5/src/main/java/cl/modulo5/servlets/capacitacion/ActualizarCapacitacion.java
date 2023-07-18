package cl.modulo5.servlets.capacitacion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Capacitacion;
import java.io.IOException;
import cl.modulo5.daos.CapacitacionDAO;

/**
 * Servlet implementation class ActualizarCapacitacion
 */
public class ActualizarCapacitacion extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
        String nombre_capacitacion = request.getParameter("nombre_capacitacion");
        String correo_capacitacion = request.getParameter("correo_capacitacion");
        String curso_capacitacion = request.getParameter("curso_capacitacion");

        Capacitacion capacitacion = new Capacitacion();
        capacitacion.setId(id);
        capacitacion.setNombre_capacitacion(nombre_capacitacion);
        capacitacion.setCorreo_capacitacion(correo_capacitacion);
        capacitacion.setCurso_capacitacion(curso_capacitacion);

        CapacitacionDAO capacitacionDAO = CapacitacionDAO.getInstancia();
        capacitacionDAO.actualizarCapacitacion(capacitacion);

        response.sendRedirect("ListarCapacitaciones");
    }

}
