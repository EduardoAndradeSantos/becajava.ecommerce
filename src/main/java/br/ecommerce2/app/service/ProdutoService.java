package br.ecommerce2.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ecommerce2.app.repository.*;
import br.ecommerce2.app.model.*;

@Service
public class ProdutoService {
	
	final ProdutoRepository _repository;
	
	@Autowired
	public ProdutoService(ProdutoRepository repository) {
		_repository = repository;
	}
	
	public void inserir(Produto produto) {
		produto.setId(new Long(0));
		_repository.save(produto);
	}
	
	public List<Produto> listar(){
		return _repository.findAll();
	}

}
