package com.joseph.api2.controller;

import com.joseph.api2.model.Api2;
import com.joseph.api2.service.Api2Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tareas")
public class Api2Controller {

    @Autowired
    private Api2Service service;

    @GetMapping
    public ResponseEntity<List<Api2>> listarTareas() {
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<String> agregarTarea(@Valid @RequestBody Api2 tarea) {
        Api2 nuevaTarea = service.agregar(tarea);
        if (nuevaTarea != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Tarea agregada con éxito");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al agregar la tarea");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarTarea(@PathVariable int id) {
        service.eliminar(id);
        return ResponseEntity.ok("Tarea eliminada si existía");
    }
}