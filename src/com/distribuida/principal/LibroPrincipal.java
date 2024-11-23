package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class LibroPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categoria categoria = new Categoria(1, "categoria", "descripcion");
		Autor autor = new Autor(1, "nombre", "apellido", "ecuador", "direccion", "9999999999", "correo");
		Libro libro = new Libro();
		libro.setIdLibro(1);
		libro.setTitulo("titulo");
		libro.setEditorial("editorial");
		libro.setNumPaginas(1);
		libro.setEdicion("edicion");
		libro.setIdioma("idioma");
		libro.setFechaPublicacion(new Date());
		libro.setDescripcion("descripcion");
		libro.setTipoPasta("tipoPasta");
		libro.setIsbn("isbn");
		libro.setNumEjemplares(1);
		libro.setPortada("portada");
		libro.setPresentacion("presentacion");
		libro.setPrecio(10.20);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		System.out.println(libro.toString());
	}

}
