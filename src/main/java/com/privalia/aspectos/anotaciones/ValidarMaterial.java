package com.privalia.aspectos.anotaciones;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ValidarMaterial {
	
	
	
	@Before("execution( * com.privalia.aspectos.anotaciones.Comprar.compra(..))")
	public void comprobarCantidad() {
		System.out.println("Se comprueba la cantidad");
	}

	  @AfterReturning("execution( * com.privalia.aspectos.anotaciones.Comprar.compra(..))")
	public void empaquetar() {
		System.out.println("Empaquetar");
	}

	  @AfterThrowing("execution( * com.privalia.aspectos.anotaciones.Comprar.compra(..))")
	public void ponerReclamacion() {
		System.out.println("Se reclama");
	}
}
