package com.joseph.api2.service;

import com.joseph.api2.model.Api2;
import com.joseph.api2.repository.Api2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Api2Service {

    @Autowired
    private Api2Repository repository;

    public List<Api2> listar() {
        return repository.listar();
    }

    public Api2 agregar(Api2 tarea) {
        return repository.agregar(tarea);
    }

    public void eliminar(int id) {
        repository.eliminar(id);
    }
}