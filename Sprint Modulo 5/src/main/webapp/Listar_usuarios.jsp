<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page import="modelo.Usuario"%>
<%@ page import="modelo.Administrativo"%>
<%@ page import="modelo.Profesional"%>
<%@ page import="modelo.Cliente"%>
<%@ page import="java.util.List"%>
<html>
<head>
<title>Listar Usuarios</title>
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
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
        <h1 class="mt-4">Listado de Usuarios</h1>
        <table class="table table-striped mt-4">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Tipo</th>
                    <th>Atributo Específico</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <% List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios"); %>
                <% for (Usuario usuario : usuarios) { %>
                <tr>
                    <td><%= usuario.getId() %></td>
                    <td><%= usuario.getNombre() %></td>
                    <td><%= usuario.getTipo() %></td>
                    <td>
                        <% 
                        if (usuario instanceof Administrativo) {
                            Administrativo administrativo = (Administrativo) usuario;
                            out.print(administrativo.getArea());
                        } else if (usuario instanceof Profesional) {
                            Profesional profesional = (Profesional) usuario;
                            out.print(profesional.getTitulo());
                        } else if (usuario instanceof Cliente) {
                            Cliente cliente = (Cliente) usuario;
                            out.print(cliente.getEmpresa());
                        }
                        %>
                    </td>
                    <td>
                        <a href="EditarUsuario?id=<%= usuario.getId() %>"
                            class="btn btn-primary btn-sm">Editar</a>
                        <a href="EliminarUsuario?id=<%= usuario.getId() %>"
                            class="btn btn-danger btn-sm">Eliminar</a>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>
    <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>

