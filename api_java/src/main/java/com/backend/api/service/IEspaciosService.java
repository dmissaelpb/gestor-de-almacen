package com.backend.api.service;

import com.backend.api.entity.Espacios;


import java.util.List;
import java.util.Optional;

public interface IEspaciosService {


    public List<Espacios> findAll();   //consultar todos
    public void agregarEspacios (Espacios espacios);// crear

    public Optional<Espacios> findEspacios(Long id); // consultar x id

    public Espacios uptadeEspacios(Espacios espacios); // actualizar
    public void deleteEspacios(Long id); // eliminar

    public Espacios findById (Long id);

}
