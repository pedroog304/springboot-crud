package com.example.rinkiucrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.rinkiucrud.model.Producto;
import com.example.rinkiucrud.service.api.ProductoServiceApi;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoServiceApi productoServiceApi;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", productoServiceApi.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("producto", productoServiceApi.get(id));
		} else {
			model.addAttribute("producto", new Producto());
		}
		return "save";
	}

	@PostMapping("/save")
	public String save(Producto producto, Model model) {
		productoServiceApi.save(producto);
		return "redirect:/home/";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		productoServiceApi.delete(id);

		return "redirect:/home/";
	}

}
