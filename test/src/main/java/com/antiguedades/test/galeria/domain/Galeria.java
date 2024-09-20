package com.antiguedades.test.galeria.domain;

import com.antiguedades.test.antiguedades.domain.Antiguedades;

import jakarta.persistence.Column;
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
public class Galeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "La imagen no puede ser vacia")
    @Column(length = 1000)
    private String imagenUrl;

    @ManyToOne
    @JoinColumn(name = "antiguedadesId")
    private Antiguedades antiguedades;

}
