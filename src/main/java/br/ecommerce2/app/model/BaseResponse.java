package br.ecommerce2.app.model;

import javax.persistence.Transient;

public class BaseResponse {
	
	@Transient
	public int StatusCode;
	@Transient
	public String Message;
	
	

}
