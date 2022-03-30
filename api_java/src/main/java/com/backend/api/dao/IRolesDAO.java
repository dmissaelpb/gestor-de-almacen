package com.backend.api.dao;

import com.backend.api.entity.Roles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IRolesDAO extends CrudRepository<Roles, Long> {
   /* public Roles findByEmail(String email);

    public Roles findByEmailAndPassword(String email, String password);

    public Optional<Roles> findById(Long id);

    @Query("select u from Roles u where u.id=?1")
    public Roles findByIdSQL(Long id);*/
}
