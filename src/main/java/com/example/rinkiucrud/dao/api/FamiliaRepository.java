package com.example.rinkiucrud.dao.api;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.rinkiucrud.model.Clase;
import com.example.rinkiucrud.model.Familia;

public interface FamiliaRepository extends CrudRepository<Familia, Long> {
   
}
