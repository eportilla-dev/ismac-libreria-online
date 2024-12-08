package com.distribuida.principaldao;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class LibroDAOPrincipal {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
		
		// create
		Autor autor = autorDAO.findOne(1);
		Categoria categoria = categoriaDAO.findOne(1);
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
		libroDAO.add(libro);
		
		libroDAO.findAll().forEach(item -> {
			System.out.println(item.toString());
		});
	}

}
