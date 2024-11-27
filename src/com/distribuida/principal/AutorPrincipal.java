package com.distribuida.principal;

import com.distribuida.entities.Autor;

public class AutorPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor autor = new Autor(1, "Felipe", "Castro", "ecuador", "direccion", "9999999999", "correo");
		System.out.println(autor.toString());
	}

}
