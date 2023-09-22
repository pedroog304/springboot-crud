package com.example.rinkiucrud.model;
import jakarta.persistence.*;

@Entity
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;
    
    private String nombre;
    
    //@ManyToOne
   // @JoinColumn(name = "departamento_numero")
    private Long departamento_numero;

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

	public Long getDepartamento() {
		return departamento_numero;
	}

	public void setDepartamento(Long departamento_numero) {
		this.departamento_numero = departamento_numero;
	}
    
    
}

