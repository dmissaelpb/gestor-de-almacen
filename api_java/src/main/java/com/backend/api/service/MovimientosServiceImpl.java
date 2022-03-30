package com.backend.api.service;

import com.backend.api.dao.IMovimientosDAO;
import com.backend.api.entity.Movimientos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MovimientosServiceImpl implements  IMovimientosService {
    @Autowired
    private IMovimientosDAO movimientosDAO;


    public List<Movimientos> findAll() {
        return null;
    }

    @Override
    public void agregarMovimientos(Movimientos movimientos) {

    }

    @Override
    public Movimientos findMovimientos(Long id) {
        return null;
    }

    @Override
    public Movimientos uptadeMovimientos(Movimientos movimientos) {
        return null;
    }

    @Override
    public void deleteTiposDeMateriales(Long id) {

    }
}
