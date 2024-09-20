package com.antiguedades.test.historialPropiedad.domain;


import com.antiguedades.test.antiguedades.domain.Antiguedades;
import com.antiguedades.test.persona.domain.Persona;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistorialPropiedad {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "personaId", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "antiguedadId", nullable = false)
    private Antiguedades antiguedad;


}
