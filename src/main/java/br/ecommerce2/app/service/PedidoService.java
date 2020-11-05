package br.ecommerce2.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ecommerce2.app.repository.*;
import br.ecommerce2.app.model.*;

@Service
public class PedidoService {

	final PedidoRepository _repository;
	
	@Autowired
	public PedidoService(PedidoRepository repository) {
		_repository = repository;
	}
	
	public void inserir(Pedido pedido) {
		pedido.setId(new Long(0));
		_repository.save(pedido);
	}
	
	
}
