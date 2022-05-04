package com.backend.api.dao;

import com.backend.api.entity.Movimientos;
import org.springframework.data.repository.CrudRepository;

public interface IMovimientosDAO extends CrudRepository<Movimientos, Long> {
}
