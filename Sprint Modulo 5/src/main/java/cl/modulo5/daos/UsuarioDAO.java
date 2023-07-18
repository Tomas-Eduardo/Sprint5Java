package cl.modulo5.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;
import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;


public class UsuarioDAO {
    private static UsuarioDAO instancia;
    private Connection conexion;

    private UsuarioDAO() {
        // Establecer la conexión a la base de datos en el constructor privado
        // Usar Singleton para asegurar que solo haya una instancia de UsuarioDAO
        // y una única conexión a la base de datos en todo el proyecto
        conexion = obtenerConexion(); // Implementar este método
    }

    public static UsuarioDAO getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioDAO();
        }
        return instancia;
    }

    // Métodos CRUD

    public List<Usuario> obtenerUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();
        String consulta = "SELECT id, nombre, tipo, area, titulo, empresa FROM usuario";

        try (
        	 PreparedStatement statement = conexion.prepareStatement(consulta);

             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
            	Administrativo administrativo = new Administrativo(0, consulta, consulta, consulta);
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("id"));
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setTipo(resultSet.getString("tipo"));
                administrativo.setArea(resultSet.getString("area"));
                
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    public Usuario obtenerUsuarioPorId(int id) {
        Usuario usuario = null;
        String consulta = "SELECT id, nombre, tipo FROM usuario WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    usuario = new Usuario();
                    usuario.setId(resultSet.getInt("id"));
                    usuario.setNombre(resultSet.getString("nombre"));
                    usuario.setTipo(resultSet.getString("tipo"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }
    
    public List<Usuario> obtenerUsuariosPorTipo(String tipo) {
        List<Usuario> usuarios = new ArrayList<>();
        String consulta = "SELECT id, nombre, tipo FROM usuario WHERE tipo = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, tipo);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setId(resultSet.getInt("id"));
                    usuario.setNombre(resultSet.getString("nombre"));
                    usuario.setTipo(resultSet.getString("tipo"));
                    usuarios.add(usuario);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
    public void agregarUsuario(Usuario usuario) {
        String consulta = "INSERT INTO usuario (nombre, tipo, area, titulo, empresa) VALUES (?, ?, ?, ?, ?)";

        try (

        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getTipo());


            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void agregarAdministrativo(Administrativo administrativo) {
        String consulta = "INSERT INTO usuario (nombre, tipo, area) VALUES (?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, administrativo.getNombre());
            statement.setString(2, administrativo.getTipo());
            statement.setString(3, administrativo.getArea());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void agregarProfesional(Profesional profesional) {
        String consulta = "INSERT INTO usuario (nombre, tipo, titulo) VALUES (?, ?, ?)";

        try (

        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, profesional.getNombre());
            statement.setString(2, profesional.getTipo());
            statement.setString(3, profesional.getTitulo());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void agregarCliente(Cliente cliente) {
        String consulta = "INSERT INTO usuario (nombre, tipo, empresa) VALUES (?, ?, ?)";

        try (

        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getTipo());
            statement.setString(3, cliente.getEmpresa());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void actualizarUsuario(Usuario usuario) {
        String consulta = "UPDATE usuario SET nombre = ?, tipo = ? WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getTipo());
            statement.setInt(3, usuario.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarUsuario(int id) {
        String consulta = "DELETE FROM usuario WHERE id = ?";

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