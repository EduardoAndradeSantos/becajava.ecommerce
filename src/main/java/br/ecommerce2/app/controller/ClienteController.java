package br.ecommerce2.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.ecommerce2.app.model.*;
import br.ecommerce2.app.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	private final ClienteService _service;
	
	@Autowired
	public ClienteController(ClienteService service) {
		_service = service;
	}
	
	@PostMapping
    public ResponseEntity inserir(@RequestBody Cliente cliente) {
		_service.inserir(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).body("Cliente inserido com sucesso!");
    }
	
	@GetMapping
    public ResponseEntity listar() {		
		Iterable<Cliente> clientes = _service.listar();  		
    	return ResponseEntity.status(HttpStatus.OK).body(clientes);
    }

}
