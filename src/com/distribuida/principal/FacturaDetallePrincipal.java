package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetallePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(1, "1111111111", "pablo", "filomeno", "direccion", "9999999999", "correo");
		Factura factura = new Factura();
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-0001");
		factura.setFecha(new Date());
		factura.setTotalNeto(100.50);
		factura.setIva(15.30);
		factura.setTotal(116.20);
		factura.setCliente(cliente);
		System.out.println(factura.toString());
		
		Categoria categoria = new Categoria(1, "Deportes", "descripcion");
		Autor autor = new Autor(1, "Felipe", "Castro", "ecuador", "direccion", "9999999999", "correo");
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
		
		FacturaDetalle facturaDetalle = new FacturaDetalle(1, 2, 20.25, factura, libro);
		System.out.println(facturaDetalle.toString());
	}

}
