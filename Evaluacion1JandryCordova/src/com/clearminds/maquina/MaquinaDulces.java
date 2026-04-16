package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;



public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
        celdas = new ArrayList<>();
        saldo = 0;
    }
	
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}
	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void agregarCelda( Celda codigo) {
		 Celda nuevaCelda = new Celda(codigo.getCodigo());
		 celdas.add(nuevaCelda);
	}
	 
	public void mostrarConfiguracion() {
		for ( int a=0;a<celdas.size();a++) {
			int posicion = a + 1;
			Celda ValorRecu = celdas.get(a);
			System.out.println("Celda"+posicion+":"+ValorRecu.getCodigo());
		}
	}
	
	public Celda buscarCelda (String codigo) {
		if (codigo != null && !codigo.trim().isEmpty()) {
			for(int a=0;a<celdas.size();a++) {
				Celda ValorRecu = celdas.get(a);
				if(ValorRecu.getCodigo().equals(codigo)) {
					return ValorRecu;
				}	
			}
			return null;
		}else {
			return null;
		}
	}
	
	public void cargarProducto( Producto producto, String codigo, int items ) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, items);
	}
	
	public void mostrarProductos() {
		for ( int a=0;a<celdas.size();a++) {
			Celda valorRecuperado=celdas.get(a);
			if( valorRecuperado.getProducto() != null) {
				String nombre = valorRecuperado.getProducto().getCodigo();
				double precio = valorRecuperado.getProducto().getPrecio();
				if ( nombre != null && !nombre.trim().isEmpty()) {
					System.out.println("Celda:"+valorRecuperado.getCodigo()+" Stock:"+valorRecuperado.getStock()+" Producto:"
							+nombre+" Precio:"+precio);
				}
				
			}else {
				System.out.println("Celda:"+valorRecuperado.getCodigo()+" Stock:"+valorRecuperado.getStock()+
						" Sin Producto asignado");
			}
		}
		System.out.println(saldo);
	}
	
	public Producto buscarProductoEnCelda (String codigo) {
		for ( int a=0; a<celdas.size();a++) {
			Celda valorEncontrado = celdas.get(a);
			if (valorEncontrado.getCodigo() != null && valorEncontrado.getCodigo().equals(codigo)) {
				if(valorEncontrado.getProducto() != null) {
					String nombre = valorEncontrado.getProducto().getNombre();
					if ( nombre != null && !nombre.trim().isEmpty()) {
						return valorEncontrado.getProducto();
					}else {
						return null;
					}
				}
			}
		}
		return null;
		
	}
	
	public Double consultarPrecio ( String codigo) {
		if ( codigo == null || codigo.trim().isEmpty()) {
			return null;
		}
		for ( int i=0;i<celdas.size();i++) {
			Celda valorRecuperado = celdas.get(i);
			if (valorRecuperado.getCodigo().equals(codigo)) {
				if( valorRecuperado.getProducto() != null) {
					return valorRecuperado.getProducto().getPrecio();
				}else {
					return null;
				}
			}
		}
		return null;
	}
	
	public Celda buscarCeldaProducto(String codigo) {
		if ( codigo == null || codigo.trim().isEmpty()) {
			return null;
		}
		for ( int a=0;a<celdas.size();a++) {
			Celda valorRecuperado = celdas.get(a);
			if ( valorRecuperado.getProducto() != null) {
				if ( valorRecuperado.getProducto().getCodigo().equals(codigo)) {
					return valorRecuperado;
				}
			}
		}
		return null;
	}
	
	public void incrementarProductos(String codigo, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		int cantidadProducto= celdaEncontrada.getStock();
		celdaEncontrada.setStock(cantidadProducto+cantidad);
		
	}
	
	public void vender( String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		int cantidadStock = celdaEncontrada.getStock();
		celdaEncontrada.setStock(cantidadStock-1);
		double precio = celdaEncontrada.getProducto().getPrecio();
		saldo+=precio;
		
	}
	
	public Double venderConCambio(String codigo, double valor) {
	    Celda celda = buscarCelda(codigo);
	    if (celda == null || celda.getProducto() == null) {
	        return null; 
	    }
	    
	    if (celda.getStock() <= 0) {
	        return null; 
	    }
	    double precioProducto = celda.getProducto().getPrecio();

	    if (valor < precioProducto) {
	        return null; 
	    }

	    celda.setStock(celda.getStock() - 1);

	    saldo += precioProducto;

	    double cambio = valor - precioProducto;
	    return cambio;
	}
	
	public ArrayList<Producto> buscarMenores(double limite) {
	    ArrayList<Producto> productosMenores = new ArrayList<>();
	    
	    for (Celda celda : celdas) {
	        Producto producto = celda.getProducto();
	        if (producto != null && producto.getPrecio() <= limite) {
	            productosMenores.add(producto);
	        }
	    }
	    
	    return productosMenores;
	}


}
