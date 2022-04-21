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


    @Override
    public List<Movimientos> findAll() {
        return (List<Movimientos>) movimientosDAO.findAll();
    }

    @Override
    public void agregarMovimientos(Movimientos movimientos) {
        movimientosDAO.save(movimientos);
    }

    @Override
    public Optional<Movimientos> findMovimientos(Long id) {
        return (Optional<Movimientos>) movimientosDAO.findById(id);
    }

    @Override
    public Movimientos uptadeMovimientos(Movimientos movimientos) {
        return (Movimientos) movimientosDAO.save(movimientos);
    }

    @Override
    public void deleteMoviminetos(Long id) {
        movimientosDAO.deleteById(id);
    }



    @Override
    public Movimientos findById(Long id) {
        return movimientosDAO.findById(id).orElse(null);
    }

}
