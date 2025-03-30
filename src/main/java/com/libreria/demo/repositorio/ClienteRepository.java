package com.libreria.demo.repositorio;

import com.libreria.demo.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Métodos personalizados (opcional)
    Cliente findByEmail(String email);
}