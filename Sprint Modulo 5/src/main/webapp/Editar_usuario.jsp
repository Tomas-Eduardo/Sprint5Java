<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page import="modelo.Usuario"%>

<html>
<head>
<title>Editar Usuario</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
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
                <li class="nav-item">
                    <a class="nav-link" href="Page-edicion.jsp">Editar Usuarios</a>
                </li>
            </ul>
        </div>
    </nav>
	<div class="container">
		<h1>Editar Usuario</h1>
		<% Usuario usuario = (Usuario) request.getAttribute("usuario"); %>
		<form action="ActualizarUsuario" method="POST">
			<input type="hidden" name="id" value="<%= usuario.getId() %>">
			<div class="form-group">
				<label for="nombre">Nombre:</label> <input type="text"
					class="form-control" name="nombre"
					value="<%= usuario.getNombre() %>">
			</div>
			<div class="form-group">
				<label for="tipo">Tipo:</label> <input type="text"
					class="form-control" name="tipo"
					value="<%= usuario.getTipo() %>">
			</div>
			<button type="submit" class="btn btn-primary">Actualizar</button>
		</form>
	</div>
	<!-- Agregar los scripts de JavaScript de Bootstrap al final del documento -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>

