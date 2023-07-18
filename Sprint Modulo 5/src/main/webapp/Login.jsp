<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>

  <!-- Cargar el CSS de Bootstrap desde CDN -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
  <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="card">
          <div class="card-header bg-danger text-white">
            <h2 class="text-center">Login</h2>
          </div>
          <div class="card-body">
            <form action="Inicio" method="post">
              <div class="form-group">
                <label for="username"><strong>Usuario:</strong></label>
                <input type="text" class="form-control" id="username" name="username" required>
              </div>
              <div class="form-group">
                <label for="password"><strong>Contraseña:</strong></label>
                <input type="password" class="form-control" id="password" name="password" required>
              </div>
              <div class="form-group text-center">
                <Button type="submit" class="btn btn-primary">Ingresar</Button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Cargar el JS de Bootstrap y las dependencias desde CDN -->
  	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
