package com.example.rinkiucrud.model;

import jakarta.persistence.*;

@Entity
public class Familia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;
    
    private String nombre;
    
   // @ManyToOne
   // @JoinColumn(name = "clase_numero")
    private Long clase_numero;

	public Long getId() {
		return numero;
	}

	public void setId(Long id) {
		this.numero = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getClase() {
		return clase_numero;
	}

	public void setClase(Long clase) {
		this.clase_numero = clase;
	}
    
    
}

