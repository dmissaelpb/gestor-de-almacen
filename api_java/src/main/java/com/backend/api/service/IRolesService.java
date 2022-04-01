package com.backend.api.service;

import com.backend.api.entity.Roles;

import java.util.List;
import java.util.Optional;

public interface IRolesService {
    public List<Roles> findAll();
    public void agregarRoles (Roles roles);

    public Optional<Roles> findRoles(Long id); // consultar x id

    public Roles uptadeRoles(Roles roles); // actualizar
    public void deleteRoles (Long id); // eliminar

    public Roles findById (Long id);
}
