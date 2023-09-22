package com.example.rinkiucrud.dao.api;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.rinkiucrud.model.Clase;
import com.example.rinkiucrud.model.Departamento;

public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {
	

}