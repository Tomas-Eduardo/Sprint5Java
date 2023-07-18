package cl.modulo5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class RegistrarConsultaCliente
 */

public class RegistrarConsultaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public RegistrarConsultaCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre")+".......";
		String email = request.getParameter("email");
		String asunto = request.getParameter("asunto");
		String mensaje = request.getParameter("mensaje");
		
		request.setAttribute("nombre", nombre + ".....");
		request.setAttribute("email", email.toUpperCase());
		request.setAttribute("asunto", asunto.toUpperCase());
		request.setAttribute("mensaje", mensaje.toUpperCase());
		request.getRequestDispatcher("ResumenContacto.jsp").forward(request, response);
		
	}

}
