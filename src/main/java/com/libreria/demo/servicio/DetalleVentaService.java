package com.libreria.demo.servicio;

import com.libreria.demo.entidades.DetalleVenta;
import java.util.List;

public interface DetalleVentaService {
    List<DetalleVenta> listarTodos();
    DetalleVenta guardarDetalle(DetalleVenta detalle);
    DetalleVenta obtenerDetallePorId(Long id);
    void eliminarDetalle(Long id);
    List<DetalleVenta> obtenerDetallesPorVenta(Long ventaId); // Opcional
}