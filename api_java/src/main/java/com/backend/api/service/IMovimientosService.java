package com.backend.api.service;

import com.backend.api.entity.Movimientos;
import com.backend.api.entity.TiposDeMateriales;

import java.util.List;
import java.util.Optional;


public interface IMovimientosService {

    public List<Movimientos> findAll();

    //crear
    public void agregarMovimientos  (Movimientos movimientos);

    // consultar
    public Movimientos findMovimientos (Long id);

    //actualizar
    public Movimientos uptadeMovimientos(Movimientos movimientos);

    // eliminar
    public void deleteTiposDeMateriales(Long id);





}
