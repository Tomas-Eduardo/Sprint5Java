<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mensaje de Registro de Capacitación</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
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
        <h1>Mensaje de Registro de Capacitación</h1>
        
	 <div class="container mt-5">
	    <div class="row justify-content-center">
	      <div class="col-md-8">
	        <div class="card">
	          <div class="card-header bg-danger text-white">
	            <h2 class="text-center">Gracias por completar el formulario</h2>
	          </div>
	          <div class="card-body">
	            <h5 class="card-title">Datos Capacitación</h5>
	            <p class="card-text"><strong>Nombre:</strong> <%= request.getParameter("nombre_capacitacion") %></p>
	            <p class="card-text"><strong>Correo:</strong> <%= request.getParameter("correo_capacitacion") %></p>
	            <p class="card-text"><strong>Curso:</strong> <%= request.getParameter("curso_capacitacion") %></p>
	          </div>
	        </div>
	      </div>
	    </div>
  </div>
  <br>
   <div class="alert alert-success">
            <% String mensaje = (String) request.getAttribute("mensaje"); %>
            <%= mensaje %>
        </div>
         <form action="ListarCapacitaciones" method="get">
                
                <div class="text-center">
                    <Button type="submit" class="btn btn-primary">ver lista</Button>
                </div>
                <div class="text-left">
                    <a href="Index.jsp" class="btn btn-secondary">Atrás</a>
                </div>
            </form>
    </div>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>