package com.example.rinkiucrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.rinkiucrud.commons.GenericServiceImpl;
import com.example.rinkiucrud.dao.api.ProductoDaoApi;
import com.example.rinkiucrud.model.Producto;
import com.example.rinkiucrud.service.api.ProductoServiceApi;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Integer> implements ProductoServiceApi {

	@Autowired
	private ProductoDaoApi productoDaoApi;
	@Override
	public CrudRepository<Producto, Integer> getDao() {
		// TODO Auto-generated method stub
		return productoDaoApi;
	}

}
