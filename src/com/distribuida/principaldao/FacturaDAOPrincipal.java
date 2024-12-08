package com.distribuida.principaldao;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl", FacturaDAO.class);
		
		// create
		Cliente cliente = clienteDAO.findOne(1);
		Factura factura = new Factura();
		factura.setIdFactura(0);
		factura.setNumFactura("FAC-0001");
		factura.setFecha(new Date());
		factura.setTotalNeto(100.39);
		factura.setIva(15.32);
		factura.setTotal(116.32);
		factura.setCliente(cliente);
		facturaDAO.add(factura);
		
		facturaDAO.findAll().forEach(item -> {
			System.out.println(item.toString());
		});
	}

}
