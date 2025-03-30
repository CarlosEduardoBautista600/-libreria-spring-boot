package com.libreria.demo.servicio;

import com.libreria.demo.entidades.Libro;
import java.util.List;

public interface LibroService {
    List<Libro> listarTodos();
    Libro guardarLibro(Libro libro);
    Libro obtenerLibroPorId(Long id);
    Libro actualizarLibro(Libro libro);
    void eliminarLibro(Long id);
}