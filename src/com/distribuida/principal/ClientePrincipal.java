package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(1, "1111111111", "pablo", "filomeno", "direccion", "9999999999", "correo");
		System.out.println(cliente.toString());
	}

}
