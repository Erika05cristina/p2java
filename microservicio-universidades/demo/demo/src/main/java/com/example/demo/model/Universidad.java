package com.example.demo.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "universidades")
public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id") // Asegura que se serialice en JSON
    private Long id;

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("ciudad")
    private String ciudad;
}
