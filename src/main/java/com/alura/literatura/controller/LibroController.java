package com.alura.literatura.controller;

import com.alura.literatura.dto.LibroDto;     // Importa el DTO (Data Transfer Object) para el libro
import com.alura.literatura.model.Libro;       // Importa el modelo de dominio del libro
import com.alura.literatura.service.LibroService; // Importa el servicio responsable de la lógica de negocio del libro
import org.springframework.beans.factory.annotation.Autowired;  // Permite la inyección automática de dependencias
import org.springframework.web.bind.annotation.*; // Importa las anotaciones para definir endpoints REST

@RestController // Indica que esta clase es un controlador REST
@RequestMapping("/libros") // Mapea todos los métodos de esta clase a la ruta base "/libros"
public class LibroController {

    @Autowired // Inyecta automáticamente una instancia del servicio de libros
    private LibroService libroService; // Almacena la referencia al servicio de libros

    @PostMapping("/registrar")  // Mapea este método al endpoint POST "/libros/registrar"
    public void registrarLibro(@RequestBody LibroDto libroDto) { // Recibe un LibroDto en el cuerpo de la solicitud
        libroService.registrarLibro(libroDto); // Llama al servicio para registrar el libro usando el DTO
    }
}
