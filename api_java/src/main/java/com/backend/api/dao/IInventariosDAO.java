package com.backend.api.dao;

import com.backend.api.entity.Inventarios;
import org.springframework.data.repository.CrudRepository;

public interface IInventariosDAO extends CrudRepository <Inventarios, Long>{

}
