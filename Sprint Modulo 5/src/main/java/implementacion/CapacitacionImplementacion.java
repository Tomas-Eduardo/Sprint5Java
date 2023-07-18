package implementacion;

import java.util.ArrayList;
import java.util.List;

import interfaces.Icapacitacion;
import modelo.Capacitacion;

public class CapacitacionImplementacion implements Icapacitacion{

	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
		List<Capacitacion> capacitaciones = new ArrayList<>();
        capacitaciones.add(new Capacitacion(1, "Capacitacion 1", "Correo 1", "Curso 1"));
        capacitaciones.add(new Capacitacion(2, "Capacitacion 2", "Correo 2", "Curso 2"));
        capacitaciones.add(new Capacitacion(3, "Capacitacion 3", "Correo 3", "Curso 3"));
		return capacitaciones;
	}

	@Override
	public void registrarCapacitacion(Capacitacion capacitacion) {
		// Simula la acción de registrar una capacitación mostrando sus datos por consola
		System.out.println("Registrando capacitación:");
        System.out.println(capacitacion);
	}
	

}
