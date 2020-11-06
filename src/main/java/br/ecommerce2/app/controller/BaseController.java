package br.ecommerce2.app.controller;

import br.ecommerce2.app.model.BaseResponse;

public class BaseController {
	
	public BaseResponse errorBase = new BaseResponse();
	
	public BaseController() {
		errorBase.StatusCode = 500;
		errorBase.Message = "Ocorreu um erro inesperado. Contate o administrador";
	}

}
