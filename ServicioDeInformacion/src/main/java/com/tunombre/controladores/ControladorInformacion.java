package com.tunombre.controladores;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ControladorInformacion {
	@GetMapping("/bienvenido")
	public String bienvenido() {
		return "Hola bienvenido al servicio de informacion!";
	}
	
	@GetMapping("/acerca")
	public String acerca() {
		return "este proyecto proporciona mucha informacion";
	}
	
	@GetMapping("/contacto")
	public String contacto() {
		return "cualquier duda contactenos al correo electronico: ejemplo@gmail.com";
	}
	
}
