package com.distribuida.principaldao;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;

public class CategoriaDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		
		// create
		Categoria categoria = new Categoria(0, "categoria", "descripcion");
		categoriaDAO.add(categoria);
				
		// update
		Categoria categoria2 = new Categoria(3, "categoria update", "desc");
		categoriaDAO.up(categoria2);
				
		// findOne
		Categoria categoria3 = categoriaDAO.findOne(2);
		System.out.println(categoria3.toString());
				
		// delete
		categoriaDAO.del(3);
		
		
		List<Categoria> categorias = categoriaDAO.findAll();
		for (Categoria item : categorias) {
			System.out.println(categoria.toString());
		}
		context.close();
	}

}
