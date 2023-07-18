package interfaces;

import java.util.List;

import modelo.Capacitacion;

public interface Icapacitacion {
    
	List<Capacitacion> obtenerCapacitaciones();
	void registrarCapacitacion(Capacitacion capacitacion);
}
