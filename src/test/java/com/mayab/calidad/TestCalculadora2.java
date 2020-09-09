package com.mayab.calidad;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculadora2 {
	
	static Calculadora miCalculadora;
	
	@BeforeClass
	public static void setup(){
		System.out.println("Before test--->");
		miCalculadora = new Calculadora();
	}
	
	@Test
	public void SumaPositivosTest() {
		float sumando1 = 10;
		float sumando2 = 20;
		float expectedResult = 30;
		float resultado = -1;
	
		System.out.println("Último resultado = " + miCalculadora.getUltimaResultado());
		//end setup
		resultado = miCalculadora.suma(sumando1, sumando2);
		//end exercise
		assertEquals(expectedResult,resultado,0); //---> verify
		
	}
	
	@Test
	public void RestaPositivosTest() {
		float operador1 = 30;
		float operador2 = 50;
		float expectedResult = -20;
		float resultado = -1;
	
		System.out.println("Último resultado = " + miCalculadora.getUltimaResultado());
		resultado = miCalculadora.resta(operador1, operador2);
		
		//assertEquals(expectedResult,resultado,0);
		assertThat(resultado,is(expectedResult));
	}
	@After
	public void despues(){
		System.out.println(">>> Despues de la prueba");
	}
	@AfterClass
	public static void fin(){
		System.out.println(">>>Ya termine");
	}
}
