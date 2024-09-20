package com.antiguedades.test.persona.domain;

import java.util.List;

import com.antiguedades.test.estadoPersona.domain.EstadoPersona;
import com.antiguedades.test.genero.domain.Generos;
import com.antiguedades.test.sucursal.domain.Sucursal;
import com.antiguedades.test.tipoDireccion.domain.TipoDireccion;
import com.antiguedades.test.tipoPersona.domain.TipoPersona;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 1, max = 100, message = "La dirección debe tener entre 1 y 100 caracteres")
    private String nombre;

    @Size(min = 1, max = 100, message = "La dirección debe tener entre 1 y 100 caracteres")
    private String apellido;

    @NotNull(message = "La edad no puede estar vacia")
    @Size(min = 1, max = 2, message = "La dirección debe tener minimo entre 1 o 2 caracteres")
    private String edad;

    @NotNull(message = "El numero de identificacion no puede ser vacia")
    private String identificacion;

    @ManyToOne
    @JoinColumn(name = "generoId")
    private Generos generos;

    @ManyToOne
    @JoinColumn(name = "sucursalId")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "estadoId")
    private EstadoPersona estadoPersona;

    @ManyToMany(mappedBy = "persona")
    private List<TipoPersona> tipoPersona;

    
    @ManyToMany(mappedBy = "persona")
    private List<TipoDireccion> tipoDireccion;
    
    
 
}
