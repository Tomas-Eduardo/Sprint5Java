<%@ page import="modelo.Usuario"%>
<html>
<head>
<title>Agregar Usuario</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1 class="mt-4">Agregar Usuario</h1>
		<form method="post" action="AgregarUsuario" class="mt-4">
			<div class="form-group">
				<label for="nombre">Nombre:</label>
				<input type="text" class="form-control" id="nombre" name="nombre" required>
			</div>


				<label for="nombre">Tipo de usuario:</label>

<!--surround the select box with a "custom-select" DIV element. Remember to set the width:-->
<div class="Tipo" style="width:200px;">
  <select id="tipoSelect" name="tipoSelect">
    <option value="--Select--">--Select--</option>
    <option value="Cliente">Cliente</option>
    <option value="Administrativo">Administrativo</option>
    <option value="Profesional">Profesional</option>
  </select>
</div>

<div id="inputContainer"></div>

<script>
  var tipoSelect = document.getElementById("tipoSelect");
  var inputContainer = document.getElementById("inputContainer");
  tipoSelect.addEventListener("change", function() {
    var selectedValue = tipoSelect.value;


    inputContainer.innerHTML = "";

    if (selectedValue === "Cliente") {
      var empresaInput = document.createElement("input");
      empresaInput.setAttribute("type", "text");
      empresaInput.setAttribute("name", "empresa");
      empresaInput.setAttribute("type", "text");
      empresaInput.setAttribute("placeholder", "Ingrese la empresa");
      empresaInput.setAttribute("required", "true");
      inputContainer.appendChild(empresaInput);

      
    } else if (selectedValue === "Administrativo") {
    	var area = document.createElement("input");
    	area.setAttribute("type", "text");
    	area.setAttribute("name", "area"); 
    	area.setAttribute("id", "area");
    	area.setAttribute("placeholder", "Ingrese el área");
    	area.setAttribute("required", "true");
    	inputContainer.appendChild(area);
      
    } else if (selectedValue === "Profesional") {
      var tituloInput = document.createElement("input");
      tituloInput.setAttribute("type", "text");
      tituloInput.setAttribute("name", "titulo");
      tituloInput.setAttribute("placeholder", "Ingrese el título profesional");
      tituloInput.setAttribute("required", "true");
      inputContainer.appendChild(tituloInput);
    } else {
        var errorLabel = document.createElement("label");
        errorLabel.setAttribute("class", "error");
        errorLabel.textContent = "Seleccione una opción válida";
        inputContainer.appendChild(errorLabel);

    }
  });
</script>



            <div class="text-center">
				<button type="submit" class="btn btn-primary">Agregar</button>
			</div>
			                
				<div class="text-left">
                    <a href="Index.jsp" class="btn btn-secondary">Atrás</a>
                </div>
		</form>
	</div>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>

