package br.ecommerce2.app.spec;

import br.ecommerce2.app.model.BaseResponse;

import java.util.List;

import br.ecommerce2.app.model.*;

public class ClienteList extends BaseResponse {
	
	private List<Cliente> Clientes;

	public List<Cliente> getClientes() {
		return Clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		Clientes = clientes;
	}

}
