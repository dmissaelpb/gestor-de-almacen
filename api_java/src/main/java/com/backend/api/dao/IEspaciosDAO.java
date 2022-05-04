package com.backend.api.dao;
import com.backend.api.entity.Espacios;
import org.springframework.data.repository.CrudRepository;

public interface IEspaciosDAO extends  CrudRepository<Espacios, Long> {
}
