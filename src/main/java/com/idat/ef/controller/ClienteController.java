package com.idat.ef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.ef.model.Cliente;
import com.idat.ef.service.ClienteService;

@Controller
@RequestMapping("/api/cliente/ef")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listar(){
		return service.listar();
	}
	
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Cliente obtener(@PathVariable Integer id) {
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Cliente cliente) {
		service.guardar(cliente);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Cliente cliente) {
		service.actualizar(cliente);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}

}
