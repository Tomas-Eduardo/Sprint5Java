package cl.modulo5.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import modelo.Capacitacion;

public class CapacitacionDAO {
	private static CapacitacionDAO instancia;
	private Connection conexion;
	
	private CapacitacionDAO() {
		conexion = obtenerConexion();
	}

	public static CapacitacionDAO getInstancia() {
		if (instancia == null) {
			instancia = new CapacitacionDAO();
		}
		return instancia;
	}
	
	
	public List<Capacitacion> obtenerCapacitacion() {
	    List<Capacitacion> capacitaciones = new ArrayList<>();
	    String consulta = "SELECT id, nombre_capacitacion, correo_capacitacion, curso_capacitacion FROM capacitacion";

	    try (PreparedStatement statement = conexion.prepareStatement(consulta);
	         ResultSet resultSet = statement.executeQuery()) {

	        while (resultSet.next()) {
	            Capacitacion capacitacion = new Capacitacion();
	            capacitacion.setId(resultSet.getInt("id"));
	            capacitacion.setNombre_capacitacion(resultSet.getString("nombre_capacitacion"));
	            capacitacion.setCorreo_capacitacion(resultSet.getString("correo_capacitacion"));
	            capacitacion.setCurso_capacitacion(resultSet.getString("curso_capacitacion"));
	            capacitaciones.add(capacitacion);	
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return capacitaciones;
	}
	
	public Capacitacion obtenerCapacitacionPorId(int id) {
        Capacitacion capacitacion = null;
        String consulta = "SELECT id, nombre_capacitacion, correo_capacitacion, curso_capacitacion FROM capacitacion WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    capacitacion = new Capacitacion();
                    capacitacion.setId(resultSet.getInt("id"));
                    capacitacion.setNombre_capacitacion(resultSet.getString("nombre_capacitacion"));
                    capacitacion.setCorreo_capacitacion(resultSet.getString("correo_capacitacion"));
                    capacitacion.setCurso_capacitacion(resultSet.getString("curso_capacitacion"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return capacitacion;
    }
	
	
	public void agregarCapacitacion(Capacitacion capacitacion) {
        String consulta = "INSERT INTO capacitacion (nombre_capacitacion, correo_capacitacion, curso_capacitacion) VALUES (?, ?, ?)";

        try (

        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, capacitacion.getNombre_capacitacion());
            statement.setString(2, capacitacion.getCorreo_capacitacion());
            statement.setString(3, capacitacion.getCurso_capacitacion());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void actualizarCapacitacion(Capacitacion capacitacion) {
        String consulta = "UPDATE capacitacion SET nombre_capacitacion = ?, correo_capacitacion = ?, curso_capacitacion = ? WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, capacitacion.getNombre_capacitacion());
            statement.setString(2, capacitacion.getCorreo_capacitacion());
            statement.setString(3, capacitacion.getCurso_capacitacion());
            statement.setInt(4, capacitacion.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	
	public void eliminarCapacitacion(int id) {
        String consulta = "DELETE FROM capacitacion WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	private Connection obtenerConexion() {
        Connection conexion = null;
        try {
            String url = "jdbc:mysql://localhost:3306/prevencion_riesgos";
            String usuario = "pruebaConexion";
            String password = "Equipo3+";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }
	
	
	
	

}
