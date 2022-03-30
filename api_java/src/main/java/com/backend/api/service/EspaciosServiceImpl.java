package com.backend.api.service;


import com.backend.api.dao.IEspaciosDAO;
import com.backend.api.entity.Espacios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service                            //
public class EspaciosServiceImpl implements IEspaciosService {

    @Autowired
    private IEspaciosDAO espaciosDao;
    @Override                           // consultar all
    public List<Espacios> findAll() {
        return (List<Espacios>) espaciosDao.findAll();
    }

    @Override  // crear
    public void agregarEspacios(Espacios espacios) {

        espaciosDao.save(espacios);
    }

    @Override
    public Optional<Espacios> findEspacios(Long id) {

        return (Optional<Espacios>) espaciosDao.findById(id);
    }


    @Override //actualizar
    public Espacios uptadeEspacios(Espacios espacios) {

        return (Espacios)espaciosDao.save(espacios) ;
    }

    @Override // eliminar
    public void deleteEspacios(Long id) {
        espaciosDao.deleteById(id);

    }

    @Override   // consultar
    public Espacios findById(Long id) {

        return espaciosDao.findById(id).orElse(null);
    }
}


