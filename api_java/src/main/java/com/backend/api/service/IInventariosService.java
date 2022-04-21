package com.backend.api.service;
import com.backend.api.entity.Espacios;
import com.backend.api.entity.Inventarios;

import java.util.List;
import java.util.Optional;

public interface IInventariosService {

    public List<Inventarios> findAll();   //consultar todos
    public void agregarInventarios (Inventarios inventarios);// crear

    public Inventarios uptadeInventarios(Inventarios inventarios); // actualizar
    public void deleteInventarios(Long id); // eliminar

    public Inventarios findById (Long id);




}
