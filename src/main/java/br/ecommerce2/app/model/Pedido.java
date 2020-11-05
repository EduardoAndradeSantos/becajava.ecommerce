package br.ecommerce2.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private double Valor;
	
	@ManyToOne
    @JoinColumn(name ="ProdutoId")
	private Produto Produto;

	@ManyToOne
    @JoinColumn(name ="ClienteId")
	private Cliente Cliente;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public Produto getProduto() {
		return Produto;
	}

	public void setProduto(Produto produto) {
		Produto = produto;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	
	
}



