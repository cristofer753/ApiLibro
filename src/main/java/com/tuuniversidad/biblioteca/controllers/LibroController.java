package com.tuuniversidad.biblioteca.controllers;

import com.tuuniversidad.biblioteca.models.Libro;
import com.tuuniversidad.biblioteca.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    
    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.findAll(); 
    }

    @GetMapping("/{id_libro}")
    public Libro getLibroById(@PathVariable("id_libro") Long id) {
        return libroService.findById(id); 
    }

    @PostMapping
    public void addLibro(@RequestBody Libro libro) {
        libroService.save(libro); 
    }
}
