package com.example.rinkiucrud.model;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int sku;
	
	@Column
	private String articulo;
	
	@Column
	private String marca;
	
	@Column
	private String modelo;
	
	@Column
	private int departamento;
	
	@Column
	private int clase;
	
	@Column
	private int familia;
	
	@Column
	private String fecha_alta;
	
	@Column
	private int stock;
	
	@Column
	private int cantidad;
	
	@Column
	private int descontinuado;
	
	@Column
	private String fecha_baja;

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public int getFamilia() {
		return familia;
	}

	public void setFamilia(int familia) {
		this.familia = familia;
	}

	public String getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(String fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getDescontinuado() {
		return descontinuado;
	}

	public void setDescontinuado(int descontinuado) {
		this.descontinuado = descontinuado;
	}

	public String getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(String fecha_baja) {
		this.fecha_baja = fecha_baja;
	}
	

}
