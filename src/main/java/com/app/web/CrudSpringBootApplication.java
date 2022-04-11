package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Empleado;
import com.app.web.repositorio.EmpleadoRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}

	@Autowired
	private EmpleadoRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Empleado empleado1 = new Empleado("Antonio","Antonio1234@gmail.com","Activo","Desarrollo Web");
		repositorio.save(empleado1);
		Empleado empleado2 = new Empleado("Marco","marco4321@gmail.com","Inactivo","Recursos humanos");
		repositorio.save(empleado2);
		*/
	}

}
