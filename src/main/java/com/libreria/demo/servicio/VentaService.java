package com.libreria.demo.servicio;

import com.libreria.demo.entidades.Venta;
import java.util.List;

public interface VentaService {
    List<Venta> listarTodas();
    Venta guardarVenta(Venta venta);
    Venta obtenerVentaPorId(Long id);
    void eliminarVenta(Long id);
}