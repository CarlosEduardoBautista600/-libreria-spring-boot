package com.libreria.demo.repositorio;

import com.libreria.demo.entidades.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
    // Método para buscar detalles por venta (opcional)
    List<DetalleVenta> findByVentaId(Long ventaId);
}