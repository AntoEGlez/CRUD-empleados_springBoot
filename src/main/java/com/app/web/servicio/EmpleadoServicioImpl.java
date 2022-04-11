package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Empleado;
import com.app.web.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {

	@Autowired
	private EmpleadoRepositorio repositorio;

	@Override
	public List<Empleado> listarTodosEmpleados() {
		return repositorio.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return repositorio.save(empleado);
	}

	@Override
	public Empleado obtenerEmpleadoId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return repositorio.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		repositorio.deleteById(id);

	}

}
