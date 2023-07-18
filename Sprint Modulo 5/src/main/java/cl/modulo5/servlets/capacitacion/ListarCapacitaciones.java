package cl.modulo5.servlets.capacitacion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Capacitacion;
import interfaces.Icapacitacion;
import java.io.IOException;
import java.util.List;
import cl.modulo5.daos.CapacitacionDAO;
import implementacion.CapacitacionImplementacion;

/**
 * Servlet implementation class ListarCapacitaciones
 */
public class ListarCapacitaciones extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CapacitacionDAO capacitacionDAO = CapacitacionDAO.getInstancia();
	    List<Capacitacion> capacitaciones = capacitacionDAO.obtenerCapacitacion();
	    
	    request.setAttribute("capacitaciones", capacitaciones);
	    request.getRequestDispatcher("ListarCapacitaciones.jsp").forward(request, response);
         
	}


}
