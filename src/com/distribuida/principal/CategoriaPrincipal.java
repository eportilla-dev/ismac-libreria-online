package com.distribuida.principal;

import com.distribuida.entities.Categoria;

public class CategoriaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categoria categoria = new Categoria(1, "Deportes", "descripcion");
		System.out.println(categoria.toString());
	}

}
