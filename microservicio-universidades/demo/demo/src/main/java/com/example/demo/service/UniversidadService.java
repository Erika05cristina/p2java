package com.example.demo.service;

import com.example.demo.model.Universidad;
import com.example.demo.repository.UniversidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversidadService {

    @Autowired
    private UniversidadRepository repository;

    public List<Universidad> listarTodas() {
        return repository.findAll();
    }

    public Optional<Universidad> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Universidad guardar(Universidad universidad) {
        return repository.save(universidad);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
