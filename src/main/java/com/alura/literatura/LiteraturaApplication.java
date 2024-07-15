package com.alura.literatura;

import com.alura.literatura.principal.Principal; // Importa la clase que maneja la lógica principal de la aplicación
import com.alura.literatura.repository.LibroRepository; // Importa el repositorio para acceder a datos de libros
import org.springframework.beans.factory.annotation.Autowired; // Permite la inyección automática de dependencias
import org.springframework.boot.CommandLineRunner; // Interfaz para ejecutar código después del inicio de Spring
import org.springframework.boot.SpringApplication; // Clase principal para iniciar aplicaciones Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication; // Anotación que habilita la configuración automática de Spring Boot

@SpringBootApplication // Marca esta clase como el punto de entrada de la aplicación Spring Boot
public class LiteraturaApplication implements CommandLineRunner { // Implementa CommandLineRunner para ejecutar código al inicio

	@Autowired // Inyecta automáticamente una instancia del repositorio de libros
	private LibroRepository libroRepository; // Almacena la referencia al repositorio de libros

	public static void main(String[] args) { // Método principal para iniciar la aplicación
		SpringApplication.run(LiteraturaApplication.class, args); // Inicia la aplicación Spring Boot
	}

	@Override // Sobrescribe el método run de CommandLineRunner
	public void run(String... args) throws Exception { // Código a ejecutar después del inicio de Spring
		Principal principal = new Principal(libroRepository); // Crea una instancia de la clase principal y le pasa el repositorio
		principal.muestraElMenu(); // Inicia la interacción con el usuario mostrando el menú principal
	}

}
