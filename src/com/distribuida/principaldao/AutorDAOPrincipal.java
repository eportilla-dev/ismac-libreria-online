package com.distribuida.principaldao;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Cliente;
public class AutorDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		
		// create
		Autor autor = new Autor(0, "1111111111", "Nombres", "Apellidos", "Direccion", "9999999999", "correo@correo.com");
		autorDAO.add(autor);
				
		// update
		Autor autor2 = new Autor(3, "1111111111", "Nombres actualizado", "Apellidos", "Direccion", "9999999999", "correo@correo.com");
		autorDAO.up(autor2);
				
		// findOne
		Autor autor3 = autorDAO.findOne(3);
		System.out.println(autor3.toString());
				
		// delete
		autorDAO.del(3);
				
		List<Autor> autores = autorDAO.findAll();
		for (Autor item : autores) {
			System.out.println(autor.toString());
		}
		context.close();
	}

}
