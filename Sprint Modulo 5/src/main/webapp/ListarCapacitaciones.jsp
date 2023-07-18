<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="modelo.Capacitacion"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <title>Lista de capacitaciones</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Los Servlet</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="Index.jsp">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="FormularioCapacitaciones.jsp">Formulario Capacitaciones</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="FormularioContacto.jsp">Formulario de Contacto</a>
                </li>
            </ul>
        </div>
    </nav>
<div class="container">
		<h1 class="mt-4">Listado de Capacitaciones</h1>
		<table class="table table-striped mt-4">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Correo</th>
					<th>Cursos</th>
					<th>Acciones</th>
				</tr>
			</thead>
				<tbody>
				<% List<Capacitacion> capacitaciones = (List<Capacitacion>) request.getAttribute("capacitaciones"); %>
				<% for (Capacitacion capacitacion : capacitaciones) { %>
				<tr>
					<td><%= capacitacion.getId() %></td>
					<td><%= capacitacion.getNombre_capacitacion() %></td>
					<td><%= capacitacion.getCorreo_capacitacion() %></td>
					<td><%= capacitacion.getCurso_capacitacion() %></td>
					<td><a href="EditarCapacitacion?id=<%= capacitacion.getId() %>"
						class="btn btn-primary btn-sm">Editar</a> <a
						href="EliminarCapacitacion?id=<%= capacitacion.getId() %>"
						class="btn btn-danger btn-sm">Eliminar</a></td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
</body>
</html>

