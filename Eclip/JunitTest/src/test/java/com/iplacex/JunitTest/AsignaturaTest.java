package com.iplacex.JunitTest;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entidad.Estudiante;
import entidad.Asignatura;
import entidad.Nota;

public class AsignaturaTest {
	
	public AsignaturaTest() {
		
	}
	
    @AfterClass
    public static void tearDownClass() {
	
    }
    
    @Before
    public void setUp() {
    	
    }
    
    @After
    public void tearDown() {
    	
    }
    
 @Test   
public void testPromedio() {
    	System.out.println("promedio");
    	try {
    		Estudiante instance = new Estudiante("Pepito");
    		Asignatura a1 = new Asignatura("Java", 4);
    		a1.getNotas().add(new Nota(4,0.2));
    		a1.getNotas().add(new Nota(6,0.2));
    		Asignatura a2 = new Asignatura("NET", 4);
    		a2.getNotas().add(new Nota(5,0.3));
    		a2.getNotas().add(new Nota(6,0.3));
    		instance.addAsignatura(a1);
    		instance.addAsignatura(a2);
    		double result = 5.25;
    				assertEquals(instance.promedio(), result, 0);			
    				
    	}catch (IllegalArgumentException e) {
    		System.out.println(e.getMessage());
    		fail(e.getMessage());
    	}
    }
@Test
public void testAvance() {
	System.out.println("Avance");
	try {
		Asignatura instance = new Asignatura("Java", 2);
		instance.getNotas().add(new Nota(4,0.2));
		instance.getNotas().add(new Nota(6,0.2));
		double resultado = 0.4;
		assertEquals(instance.promedio(), resultado, 0);
	}catch (IllegalArgumentException e) {
		System.out.println(e.getMessage());
		fail(e.getMessage());
	}
}



}

