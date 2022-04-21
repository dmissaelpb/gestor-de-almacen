package com.backend.api.dao;
import com.backend.api.entity.Espacios;
import com.backend.api.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
public interface IEspaciosDAO extends  CrudRepository<Espacios, Long> {

   /* public Usuario findByEmail(String email);

    public Usuario findByEmailAndPassword(String email, String password);

    public Optional<Espacios> findById(Long id);

    @Query("select u from Usuario u where u.id=?1")
    public Usuario findByIdSQL(Long id);*/

    //public Optional<Espacios> findById(Long id);











}
