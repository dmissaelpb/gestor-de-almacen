package com.backend.api.dao;

import com.backend.api.entity.TiposDeMateriales;
import org.springframework.data.repository.CrudRepository;

public interface ITiposDeMaterialesDAO extends  CrudRepository<TiposDeMateriales, Long> {
}
