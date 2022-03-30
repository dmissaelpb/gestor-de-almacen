package com.backend.api.service;

import com.backend.api.entity.TiposDeMateriales;

import java.util.List;

public interface ITiposDeMaterialesService {

    public List<TiposDeMateriales> findAll();

    public void agregarTiposDeMateriales (TiposDeMateriales tiposDeMateriales);// crear

    public TiposDeMateriales findTiposDeMateriales(Long id); // consultar x id

    public TiposDeMateriales uptadeTiposDeMateriales(TiposDeMateriales tiposDeMateriales); // actualizar
    public void deleteTiposDeMateriales(Long id); // eliminar

}
