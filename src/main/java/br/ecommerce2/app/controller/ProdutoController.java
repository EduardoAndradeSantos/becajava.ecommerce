package br.ecommerce2.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ecommerce2.app.model.*;
import br.ecommerce2.app.service.*;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	final ProdutoService _service;
	
	@Autowired
	public ProdutoController(ProdutoService service) {
		_service = service;
	}
	
	@PostMapping
    public ResponseEntity inserir(@RequestBody Produto produto) {	
		_service.inserir(produto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Produto inserido com sucesso!");
    }
	
	
	@GetMapping
    public ResponseEntity listar() {		
		Iterable<Produto> produtos = _service.listar();  		
    	return ResponseEntity.status(HttpStatus.OK).body(produtos);
    }

}
