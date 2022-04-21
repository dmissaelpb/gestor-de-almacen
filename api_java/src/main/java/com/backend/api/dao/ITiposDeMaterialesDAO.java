package com.backend.api.dao;

import com.backend.api.entity.TiposDeMateriales;
import com.backend.api.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ITiposDeMaterialesDAO extends  CrudRepository<TiposDeMateriales, Long> {


}
