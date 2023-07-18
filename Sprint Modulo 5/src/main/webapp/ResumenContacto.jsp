<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Resumen de contactos</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
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
  <h1>Resumen de contactos</h1>

  <div class="card">
    <div class="card-body">
      <h5 class="card-title">Datos del Empleado</h5>
      <p class="card-text"><strong>Nombre:</strong> <%= request.getParameter("nombre") %></p>
      <p class="card-text"><strong>Email:</strong> <%= request.getParameter("email") %></p>
      <p class="card-text"><strong>Asunto:</strong> <%= request.getParameter("asunto") %></p>
      <p class="card-text"><strong>Mensaje:</strong> <%= request.getParameter("mensaje") %></p>
    </div>
  </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>