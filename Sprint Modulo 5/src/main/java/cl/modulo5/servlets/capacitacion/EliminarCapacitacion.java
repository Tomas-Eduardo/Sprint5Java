package cl.modulo5.servlets.capacitacion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import cl.modulo5.daos.CapacitacionDAO;

/**
 * Servlet implementation class EliminarCapacitacion
 */
public class EliminarCapacitacion extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		CapacitacionDAO capacitacionDAO = CapacitacionDAO.getInstancia();
		capacitacionDAO.eliminarCapacitacion(id);
		
		response.sendRedirect("ListarCapacitaciones");
	}
}
