package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Empleado;
import com.app.web.servicio.EmpleadoServicio;

@Controller
public class EmpleadoControlador {

	@Autowired
	private EmpleadoServicio servicio;

	@GetMapping({ "/empleados", "/" })
	public String listarEmpleados(Model modelo) {
		modelo.addAttribute("empleados", servicio.listarTodosEmpleados());
		return "empleados";
	}

	@GetMapping({ "/empleados/nuevo" })
	public String crearEmpleadoFormulario(Model modelo) {
		Empleado empleado = new Empleado();
		modelo.addAttribute("empleado", empleado);
		return "crear_empleado";
	}

	@PostMapping("/empleados")
	public String guardarEmpleado(@ModelAttribute("empleado") Empleado empleado) {
		servicio.guardarEmpleado(empleado);
		return "redirect:/empleados";
	}

	@GetMapping("empleados/editar/{id}")
	public String mostrarEmpleadoFormulario(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("empleado", servicio.obtenerEmpleadoId(id));
		return "editar_empleado";
	}

	@PostMapping("/empleados/{id}")
	public String actualizarEmpleado(@PathVariable Long id, @ModelAttribute("empleado") Empleado empleado,
			Model modelo) {
		Empleado empleadoExistente = servicio.obtenerEmpleadoId(id);
		empleadoExistente.setId(id);
		empleadoExistente.setNombre(empleado.getNombre());
		empleadoExistente.setEmail(empleado.getEmail());
		empleadoExistente.setEstatus(empleado.getEstatus());
		empleadoExistente.setArea(empleado.getArea());
		servicio.actualizarEmpleado(empleadoExistente);

		return "redirect:/empleados";
	}

	@GetMapping("empleados/{id}")
	public String eliminarEmpleado(@PathVariable Long id) {
		servicio.eliminarEmpleado(id);
		return "redirect:/empleados";
	}
}
