package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Empleado;

public interface EmpleadoServicio {
	
	public List<Empleado> listarTodosEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);

	public Empleado obtenerEmpleadoId(Long id);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Long id);

}
