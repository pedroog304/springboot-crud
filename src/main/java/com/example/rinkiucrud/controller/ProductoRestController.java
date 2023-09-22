package com.example.rinkiucrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.rinkiucrud.model.*;
import com.example.rinkiucrud.service.api.*;
import com.example.rinkiucrud.service.impl.*;

@RestController
@RequestMapping(value = "/api/v1/")
@CrossOrigin("*")
public class ProductoRestController {

	@Autowired
	private ProductoServiceApi productoServiceApi;

	@Autowired
    private DepartamentoService departamentoService;

    @Autowired
    private ClaseService claseService;
    
    @Autowired
    private FamiliaService familiaService;
    
	@GetMapping(value = "/all")
	public List<Producto> getAll() {
		return productoServiceApi.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public Producto find(@PathVariable Integer id) {
		return productoServiceApi.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Producto> save(@RequestBody Producto producto) {
		Producto obj = productoServiceApi.save(producto);
		return new ResponseEntity<Producto>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Producto> delete(@PathVariable Integer id) {
		Producto producto = productoServiceApi.get(id);
		if (producto != null) {
			productoServiceApi.delete(id);
		} else {
			return new ResponseEntity<Producto>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Producto>(producto, HttpStatus.OK);
	}
	@GetMapping(value = "/allDepartamentos")
	public List<Departamento> getAllDepartamentos() {
		return departamentoService.getAll();
	}
	@GetMapping(value = "/allClases")
	public List<Clase> getAllClases() {
		return claseService.getAll();
	}
	@GetMapping(value = "/allFamilias")
	public List<Familia> getAllFamilias() {
		return familiaService.getAll();
	}

}
