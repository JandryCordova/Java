package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();


        maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));


        maquina.cargarProducto(new Producto("P01", "Papitas", 0.85), "A1", 5);
        maquina.cargarProducto(new Producto("P02", "Doritos", 0.70), "A2", 4);
        maquina.cargarProducto(new Producto("P03", "CocaCola", 1.20), "B1", 6);
        maquina.cargarProducto(new Producto("P04", "Agua", 0.50), "B2", 10);
        maquina.cargarProducto(new Producto("P05", "Chocolate", 0.95), "C1", 3);
        maquina.cargarProducto(new Producto("P06", "Galletas", 0.65), "C2", 7);


        ArrayList<Producto> productosBaratos = maquina.buscarMenores(1);

        System.out.println("Productos menores:"+productosBaratos.size());
        for (Producto p : productosBaratos) {
            System.out.println("Nombre:"+p.getNombre() + " Precio:$" + p.getPrecio());
        }
    }

}
