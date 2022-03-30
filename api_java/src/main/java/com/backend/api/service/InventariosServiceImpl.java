package com.backend.api.service;
import com.backend.api.dao.IEspaciosDAO;
import com.backend.api.dao.IInventariosDAO;
import com.backend.api.entity.Espacios;
import com.backend.api.entity.Inventarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventariosServiceImpl implements IInventariosService {

    @Autowired
    private IInventariosDAO iInventariosDAO;
    @Override                           // consultar all
    public List<Inventarios> findAll() {
        return (List<Inventarios>) iInventariosDAO.findAll();
    }

    @Override
    public void agregarInventarios(Inventarios inventarios) {
        iInventariosDAO.save(inventarios);
    }



    @Override
    public Inventarios uptadeInventarios(Inventarios inventarios) {
        return (Inventarios) iInventariosDAO.save(inventarios);
    }

    @Override
    public void deleteInventarios(Long id) {
        iInventariosDAO.deleteById(id);

    }

    @Override
    public Inventarios findById(Long id) {
        return iInventariosDAO.findById(id).orElse(null);
    }

}

