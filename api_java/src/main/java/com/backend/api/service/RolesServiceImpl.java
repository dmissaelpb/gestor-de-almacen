package com.backend.api.service;



import com.backend.api.dao.IRolesDAO;
import com.backend.api.entity.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RolesServiceImpl implements  IRolesService{
    @Autowired
    private IRolesDAO rolesDAO;


    @Override
    public List<Roles> findAll() {

        return (List<Roles>) rolesDAO.findAll();
    }

    @Override
    public void agregarRoles(Roles roles) {
        rolesDAO.save(roles);
    }

    @Override
    public Optional<Roles> findRoles(Long id) {
        return (Optional<Roles>) rolesDAO.findById(id);
    }

    @Override
    public Roles uptadeRoles(Roles roles) {
        return (Roles) rolesDAO.save(roles) ;
    }

    @Override
    public void deleteRoles(Long id) {
        rolesDAO.deleteById(id);

    }

    @Override
    public Roles findById(Long id) {
        return  rolesDAO.findById(id).orElse(null);
    }

}

