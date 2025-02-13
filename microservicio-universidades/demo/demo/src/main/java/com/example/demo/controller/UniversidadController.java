package com.example.demo.controller;

import com.example.demo.model.Universidad;
import com.example.demo.service.UniversidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/universidades")
public class UniversidadController {

    @Autowired
    private UniversidadService service;

    @GetMapping
    public List<Universidad> obtenerTodas() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Universidad> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Universidad agregar(@RequestBody Universidad universidad) {
        return service.guardar(universidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
