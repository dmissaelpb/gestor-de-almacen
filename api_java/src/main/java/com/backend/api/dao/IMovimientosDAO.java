package com.backend.api.dao;

import com.backend.api.entity.Movimientos;
import com.backend.api.entity.Roles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IMovimientosDAO extends CrudRepository<Movimientos, Long> {

}
