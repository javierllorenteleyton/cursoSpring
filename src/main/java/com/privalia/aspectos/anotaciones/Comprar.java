package com.privalia.aspectos.anotaciones;

import org.springframework.stereotype.Component;

@Component(value="compra")
public class Comprar implements Compra {

	@Override
	public void compra(boolean error) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        if (error) {
        	throw new Exception("Algo va mal....");
        }
        System.out.println("Realizando la compra...");
	}

}
