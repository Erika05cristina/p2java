package com.example.demo.repository;

import com.example.demo.model.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Long> {
}
