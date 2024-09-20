package com.antiguedades.test.tipoPersona.domain;

import java.util.List;

import com.antiguedades.test.persona.domain.Persona;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoPersona {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;


private String nombre;

@ManyToMany
@JoinTable(
    name = "persona_tipoPersona", // Nombre de la tabla intermedia
    joinColumns = @JoinColumn(name = "tipoPersonaId"), // Columna que refiere a la tabla Estudiante
    inverseJoinColumns = @JoinColumn(name = "personaId") // Columna que refiere a la tabla Curso
)
  private List<Persona> persona;
}
