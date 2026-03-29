package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;



public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public MaquinaDulces() {
		
	}
	
	
	
	
	public void configurarMaquina ( String codigo1, String codigo2, String codigo3, String codigo4) {
		celda1 = new Celda(codigo1);
	    celda2 = new Celda(codigo2);
	    celda3 = new Celda(codigo3);
	    celda4 = new Celda(codigo4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("CELDA 1:"+celda1.getCodigo());
		System.out.println("CELDA 2:"+celda2.getCodigo());
		System.out.println("CELDA 3:"+celda3.getCodigo());
		System.out.println("CELDA 4:"+celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigoCelda) {
	    if (celda1 != null && codigoCelda.equals(celda1.getCodigo())) {
	        return celda1;
	    } else if (celda2 != null && codigoCelda.equals(celda2.getCodigo())) {
	        return celda2;
	    } else if (celda3 != null && codigoCelda.equals(celda3.getCodigo())) {
	        return celda3;
	    } else if (celda4 != null && codigoCelda.equals(celda4.getCodigo())) {
	        return celda4;
	    } else {
	        return null;
	    }
	}

	
	public void cargarProducto(Producto producto, String celda, int items) {
		Celda celdaRecuperada=buscarCelda(celda);
		celdaRecuperada.ingresarProducto(producto,items);
	}
	
	public void mostrarProductos() {
	    if (celda1 != null) {
	        System.out.println("**********CELDA " + celda1.getCodigo());
	        System.out.println("Saldo:" + saldo);
	        System.out.println("Stock:" + celda1.getStock());
	        if (celda1.getProducto() != null) {
	            System.out.println("Nombre Producto:" + celda1.getProducto().getNombre());
	            System.out.println("Precio Producto:" + celda1.getProducto().getPrecio());
	            System.out.println("Código Producto:" + celda1.getProducto().getCodigo());
	        } else {
	            System.out.println("La celda no tiene producto");
	        }
	    }

	    if (celda2 != null) {
	        System.out.println("**********CELDA " + celda2.getCodigo());
	        System.out.println("Saldo:" + saldo);
	        System.out.println("Stock:" + celda2.getStock());
	        if (celda2.getProducto() != null) {
	            System.out.println("Nombre Producto:" + celda2.getProducto().getNombre());
	            System.out.println("Precio Producto:" + celda2.getProducto().getPrecio());
	            System.out.println("Código Producto:" + celda2.getProducto().getCodigo());
	        } else {
	            System.out.println("La celda no tiene producto");
	        }
	    }

	    if (celda3 != null) {
	        System.out.println("**********CELDA " + celda3.getCodigo());
	        System.out.println("Saldo:" + saldo);
	        System.out.println("Stock:" + celda3.getStock());
	        if (celda3.getProducto() != null) {
	            System.out.println("Nombre Producto:" + celda3.getProducto().getNombre());
	            System.out.println("Precio Producto:" + celda3.getProducto().getPrecio());
	            System.out.println("Código Producto:" + celda3.getProducto().getCodigo());
	        } else {
	            System.out.println("La celda no tiene producto");
	        }
	    }

	    if (celda4 != null) {
	        System.out.println("**********CELDA " + celda4.getCodigo());
	        System.out.println("Saldo:" + saldo);
	        System.out.println("Stock:" + celda4.getStock());
	        if (celda4.getProducto() != null) {
	            System.out.println("Nombre Producto:" + celda4.getProducto().getNombre());
	            System.out.println("Precio Producto:" + celda4.getProducto().getPrecio());
	            System.out.println("Código Producto:" + celda4.getProducto().getCodigo());
	        } else {
	            System.out.println("La celda no tiene producto");
	        }
	    }
	}


	
	public Producto buscarProductoEnCelda(String codigoCelda) {
	    Celda celdaEncontrada = buscarCelda(codigoCelda);

	    if (celdaEncontrada != null && celdaEncontrada.getProducto() != null) {
	        return celdaEncontrada.getProducto();
	    } else {
	        return null;
	    }
	}

	
	public double consultarPrecio(String codigoCelda) {
	    Celda celdaEncontrada = buscarCelda(codigoCelda);

	    if (celdaEncontrada != null && celdaEncontrada.getProducto() != null) {
	        return celdaEncontrada.getProducto().getPrecio();
	    } else {
	        return 0;
	    }
	}

	
	public Celda buscarCeldaProducto(String codigoProducto) {
	    if (celda1 != null && celda1.getProducto() != null 
	        && codigoProducto.equals(celda1.getProducto().getCodigo())) {
	        return celda1;
	    } else if (celda2 != null && celda2.getProducto() != null 
	        && codigoProducto.equals(celda2.getProducto().getCodigo())) {
	        return celda2;
	    } else if (celda3 != null && celda3.getProducto() != null 
	        && codigoProducto.equals(celda3.getProducto().getCodigo())) {
	        return celda3;
	    } else if (celda4 != null && celda4.getProducto() != null 
	        && codigoProducto.equals(celda4.getProducto().getCodigo())) {
	        return celda4;
	    } else {
	        return null;
	    }
	}


	
	public void incrementarProductos(String codigoProducto, int cantidad) {
	    
	    Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
	    if (celdaEncontrada != null && celdaEncontrada.getProducto() != null) {
	        int stockActual = celdaEncontrada.getStock();
	        celdaEncontrada.setStock(stockActual + cantidad);
	    }
	}

	
	public void vender(String codigo) {
		Celda celdaEncontrada=buscarCelda(codigo);
		if(codigo.equals(celdaEncontrada.getCodigo())) {
			int stockRecu = celdaEncontrada.getStock()-1;
			celdaEncontrada.setStock(stockRecu);
			double precioRecu=celdaEncontrada.getProducto().getPrecio();
			saldo+=precioRecu;
		}
		mostrarProductos();
	}
	
	public double venderConCambio(String codigoCelda, double dineroCliente) {
	    Celda celdaEncontrada = buscarCelda(codigoCelda);
	    if (celdaEncontrada != null && celdaEncontrada.getProducto() != null) {
	        int stockActual = celdaEncontrada.getStock();
	        celdaEncontrada.setStock(stockActual - 1);

	        double precioProducto = celdaEncontrada.getProducto().getPrecio();
	        saldo += precioProducto;

	        return dineroCliente - precioProducto;
	    } else {
	        System.out.println("No encontré la celda o no tiene producto");
	        return dineroCliente;
	    }
	}



	public Celda getCelda1() {
		return celda1;
	}
	
	public void setCelda1( Celda celda1) {
		this.celda1=celda1;
	}
	
	public Celda getCelda2() {
		return celda2;
	}
	
	public void setCelda2( Celda celda2) {
		this.celda2=celda2;
	}
	
	public Celda getCelda3() {
		return celda3;
	}
	
	public void setCelda3( Celda celda3) {
		this.celda3=celda3;
	}
	
	public Celda getCelda4() {
		return celda4;
	}
	
	public void setCelda4( Celda celda4) {
		this.celda4=celda4;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo( double saldo) {
		this.saldo=saldo;
	}

}
