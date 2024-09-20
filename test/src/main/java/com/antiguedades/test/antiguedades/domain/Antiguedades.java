package com.antiguedades.test.antiguedades.domain;

import com.antiguedades.test.categorias.domain.categorias;
import com.antiguedades.test.epocaAntiguedad.domain.EpocaAntiguedad;
import com.antiguedades.test.historialPropiedad.domain.HistorialPropiedad;
import com.antiguedades.test.sucursal.domain.Sucursal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Antiguedades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "El nombre no puede ser null")
    private String nombre;

    private String descripcion;
    @NotNull(message = "El precio no puede ser vacio")
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "sucursalId")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "categoriaId")
    private categorias categorias;

    @ManyToOne
    @JoinColumn(name = "epocaAntiguedadId")
    private EpocaAntiguedad epocaAntiguedad;

    @ManyToOne
    private HistorialPropiedad historialPropiedad;
}
