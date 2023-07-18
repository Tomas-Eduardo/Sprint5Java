<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Inicio - Formulario de Prevención de Riesgos</title>

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
          <div class="card-header bg-danger text-white">
            <h2 class="text-center">Bienvenido al Formulario de Prevención de Riesgos</h2>
          </div>
          <div class="card-body">
            <p class="text-center">En este formulario podrás reportar cualquier tipo de riesgo detectado en tu área de trabajo. Es importante que seas claro y detallado en la descripción de la situación.</p>
            <div class="text-center mt-4">
              <a href="FormularioContacto.jsp" class="btn btn-primary mr-2">Contacto</a>
              <a href="FormularioCapacitaciones.jsp" class="btn btn-primary">Registro Capacitaciones</a>
              <a href="Agregar_usuario.jsp" class="btn btn-primary">Agregar Usuario</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Cargar el JS de Bootstrap desde CDN -->
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
