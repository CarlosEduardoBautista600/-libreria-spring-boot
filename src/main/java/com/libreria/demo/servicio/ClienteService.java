package com.libreria.demo.servicio;

import com.libreria.demo.entidades.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> listarTodos();
    Cliente guardarCliente(Cliente cliente);
    Cliente obtenerClientePorId(Long id);
    Cliente actualizarCliente(Cliente cliente);
    void eliminarCliente(Long id);
}