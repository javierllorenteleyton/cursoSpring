package com.privalia.aspectos.anotaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Principal {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.privalia.aspectos.anotaciones");
		context.refresh();
		Compra cp = (Compra) context.getBean("compra");
		try {
			System.out.println("Invocamos sin problemas");
			cp.compra(false);
			/*
			 * System.out.println("Para error"); cp.compra(true);
			 */
		} catch (Exception e) {
			System.out.println("Obtenemos exception" + e);
		}
		context.close();
	}
}
