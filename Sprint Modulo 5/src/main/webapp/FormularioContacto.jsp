<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Formulario de Contacto</title>
  <!-- Cargar el CSS de Bootstrap desde CDN -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
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
  <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-md-8">
        <div class="card">
          <div class="card-header bg-primary text-white">
            <h2 class="text-center">Formulario de Contacto</h2>
          </div>
          <div class="card-body">
            <form action="RegistrarConsultaCliente" method="post">
              <div class="form-group">
                <label for="nombre">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
              </div>
              <div class="form-group">
                <label for="email">Correo electrónico</label>
                <input type="email" class="form-control" id="email" name="email"  required>
              </div>
              <div class="form-group">
                <label for="asunto">Asunto</label>
                <input type="text" class="form-control" id="asunto" name="asunto"  required>
              </div>
              <div class="form-group">
                <label for="mensaje">Mensaje</label>
                <textarea class="form-control" id="mensaje" name="mensaje"  rows="3" required></textarea>
              </div>
                <div class="text-center mt-4">
            	<button type="submit" class="btn btn-primary">Registrar</button>
                </div>
            	
                <div class="text-left mt-4">
                    <a href="index.jsp" class="btn btn-secondary">Atrás</a>
                </div>
              
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Cargar el JS de Bootstrap desde CDN -->
  	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
