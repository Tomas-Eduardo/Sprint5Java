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
 * Servlet implementation class RegistroCapacitaciones
 */

public class AgregarCapacitaciones extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String nombre_capacitacion = request.getParameter("nombre_capacitacion");
		String correo_capacitacion = request.getParameter("correo_capacitacion");
		String curso_capacitacion = request.getParameter("curso_capacitacion");
		
		Capacitacion capacitacion = new Capacitacion();
        capacitacion.setNombre_capacitacion(nombre_capacitacion);
        capacitacion.setCorreo_capacitacion(correo_capacitacion);
        capacitacion.setCurso_capacitacion(curso_capacitacion);
        
        CapacitacionDAO capacitacionDAO = CapacitacionDAO.getInstancia();
        capacitacionDAO.agregarCapacitacion(capacitacion);
        
      
        request.setAttribute("mensaje", "La capacitación ha sido registrada exitosamente.");
        request.getRequestDispatcher("MensajeRegistroCapacitacion.jsp").forward(request, response);
        
    }
		
	}


