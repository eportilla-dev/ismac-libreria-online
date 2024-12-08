package com.distribuida.principaldao;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class ClienteDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		// create
		Cliente cliente = new Cliente(0, "1111111111", "Nombres", "Apellidos", "Direccion", "9999999999", "correo@correo.com");
		clienteDAO.add(cliente);
		
		// update
		Cliente cliente2 = new Cliente(39, "1111111111", "Nombres actualizado", "Apellidos", "Direccion", "9999999999", "correo@correo.com");
		clienteDAO.up(cliente2);
		
		// findOne
		Cliente cliente3 = clienteDAO.findOne(39);
		System.out.println(cliente3.toString());
		
		// delete
		clienteDAO.del(39);
		
		List<Cliente> clientes = clienteDAO.findAll();
		for (Cliente item : clientes) {
			System.out.println(item.toString());
		}
		context.close();
	}

}
