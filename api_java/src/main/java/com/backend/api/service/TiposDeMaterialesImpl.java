package com.backend.api.service;

import com.backend.api.dao.ITiposDeMaterialesDAO;
import com.backend.api.entity.TiposDeMateriales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TiposDeMaterialesImpl implements ITiposDeMaterialesService {
    @Autowired
    private ITiposDeMaterialesDAO tiposDeMaterialesDAO;

    @Override
    public List<TiposDeMateriales> findAll() {
        return (List<TiposDeMateriales>) tiposDeMaterialesDAO.findAll();
    }

    @Override
    public void agregarTiposDeMateriales(TiposDeMateriales tiposDeMateriales) {
        tiposDeMaterialesDAO.save(tiposDeMateriales);

    }

    @Override
    public TiposDeMateriales findTiposDeMateriales(Long id) {
        return tiposDeMaterialesDAO.findById(id).orElse(null);
    }

    @Override
    public TiposDeMateriales uptadeTiposDeMateriales(TiposDeMateriales tiposDeMateriales) {
        return (TiposDeMateriales)tiposDeMaterialesDAO.save(tiposDeMateriales) ;
    }

    @Override
    public void deleteTiposDeMateriales(Long id) {
        tiposDeMaterialesDAO.deleteById(id);
    }

    @Override
    public TiposDeMateriales findById(Long id) {
        return null;
    }


}
