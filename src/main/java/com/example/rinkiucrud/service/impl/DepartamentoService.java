package com.example.rinkiucrud.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.rinkiucrud.commons.*;
import com.example.rinkiucrud.dao.api.ClaseRepository;
import com.example.rinkiucrud.dao.api.DepartamentoRepository;
import com.example.rinkiucrud.dao.api.ProductoDaoApi;
import com.example.rinkiucrud.model.*;
import com.example.rinkiucrud.service.api.DepartamentoServiceApi;
import com.example.rinkiucrud.service.api.ProductoServiceApi;

@Service
public class DepartamentoService extends GenericServiceImpl<Departamento, Long> implements DepartamentoServiceApi{
	@Autowired
	private DepartamentoRepository departamentoRepository;
	@Override
	public CrudRepository<Departamento, Long> getDao() {
		// TODO Auto-generated method stub
		return departamentoRepository;
	}

}
