package com.distribuida.principaldao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.LibroDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetalleDAOPrincipal {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		

		LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl", FacturaDAO.class);
		FacturaDetalleDAO facturaDetalleDAO = context.getBean("facturaDetalleDAOImpl", FacturaDetalleDAO.class);
		
		// create
		Libro libro = libroDAO.findOne(12);
		Factura factura = facturaDAO.findOne(12);
		FacturaDetalle facturaDetalle = new FacturaDetalle();
		facturaDetalle.setIdFacturaDetalle(0);
		facturaDetalle.setCantidad(1);
		facturaDetalle.setSubtotal(100.31);
		facturaDetalle.setFactura(factura);
		facturaDetalle.setLibro(libro);
		facturaDetalleDAO.add(facturaDetalle);
		
		facturaDetalleDAO.findAll().forEach(item -> {
			System.out.println(item.toString());
		});
	}

}
