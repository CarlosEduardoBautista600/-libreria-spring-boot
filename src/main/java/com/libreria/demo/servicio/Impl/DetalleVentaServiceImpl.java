package com.libreria.demo.servicio.impl;

import com.libreria.demo.entidades.DetalleVenta;
import com.libreria.demo.repositorio.DetalleVentaRepository;
import com.libreria.demo.servicio.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    @Override
    public List<DetalleVenta> listarTodos() {
        return detalleVentaRepository.findAll();
    }

    @Override
    public DetalleVenta guardarDetalle(DetalleVenta detalle) {
        return detalleVentaRepository.save(detalle);
    }

    @Override
    public DetalleVenta obtenerDetallePorId(Long id) {
        return detalleVentaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarDetalle(Long id) {
        detalleVentaRepository.deleteById(id);
    }

    @Override
    public List<DetalleVenta> obtenerDetallesPorVenta(Long ventaId) {
        return detalleVentaRepository.findByVentaId(ventaId);
    }
}