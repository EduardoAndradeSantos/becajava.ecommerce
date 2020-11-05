package br.ecommerce2.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ecommerce2.app.model.*;
import br.ecommerce2.app.service.*;


@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	final PedidoService _service;
	
	@Autowired
	public PedidoController(PedidoService service) {
		_service = service;
	}

	@PostMapping
    public ResponseEntity inserir(@RequestBody Pedido pedido) {
		_service.inserir(pedido);
		return ResponseEntity.status(HttpStatus.CREATED).body("Pedido inserido com sucesso!");
    }
	
	
}
