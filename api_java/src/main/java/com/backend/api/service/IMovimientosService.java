package com.backend.api.service;

import com.backend.api.entity.Movimientos;
import java.util.List;
import java.util.Optional;


public interface IMovimientosService {

    public List<Movimientos> findAll();

    //crear
    public void agregarMovimientos  (Movimientos movimientos);

    public Optional<Movimientos> findMovimientos(Long id);


    //actualizar
    public Movimientos uptadeMovimientos(Movimientos movimientos);

    // eliminar
    public void deleteMoviminetos(Long id);

    public Movimientos findById (Long id);





}
