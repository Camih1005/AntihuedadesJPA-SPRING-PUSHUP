package com.antiguedades.test.estadoPersona.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstadoPersona {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;

private String nombre;
}
