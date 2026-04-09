package com.joseph.api2.repository;

import com.joseph.api2.model.Api2;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Api2Repository {

    private List<Api2> listaTareas = new ArrayList<>();

    public Api2Repository() {
        // Tareas por defecto
        listaTareas.add(new Api2(1, "Estudiar para Fullstack"));
        listaTareas.add(new Api2(2, "Hacer la prueba"));
    }

    public List<Api2> listar() {
        return listaTareas;
    }

    public Api2 agregar(Api2 tarea) {
        listaTareas.add(tarea);
        return tarea;
    }

    public void eliminar(int id) {
        // Busca la tarea por ID y la elimina si existe
        listaTareas.removeIf(tarea -> tarea.getId() == id);
    }
}