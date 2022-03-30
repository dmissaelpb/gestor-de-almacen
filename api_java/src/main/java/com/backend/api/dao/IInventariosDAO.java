package com.backend.api.dao;

import com.backend.api.entity.Inventarios;
import com.backend.api.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IInventariosDAO extends CrudRepository <Inventarios, Long>{

}
