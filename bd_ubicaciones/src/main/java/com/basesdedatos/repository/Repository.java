package com.basesdedatos.repository;

import java.sql.SQLException;
import java.util.List;

import com.basesdedatos.model.Ubicacion;

public interface Repository<T> {
    List<T> findAll() throws SQLException;
    T getById(Integer id) throws SQLException;
    void save(Ubicacion ubicacion) throws SQLException;
    void delete(Integer id) throws SQLException;

}
