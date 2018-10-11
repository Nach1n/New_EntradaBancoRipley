/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AnX
 */
public class EntradasTest {
    
    public EntradasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of validarRut method, of class Entradas.
     */
    @Test
    public void testValidarRut() {
        System.out.println("validarRut");
        String rut = "19.208.616-7";
        boolean expResult = true;
        boolean result = Entradas.validarRut(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Nombre method, of class Entradas.
     */
    @Test
    public void testNombre() {
        System.out.println("Nombre");
        String Nom = "Alfred";
        Entradas instance = new Entradas();
        boolean expResult = false;
        boolean result = instance.Nombre(Nom);
       // try{
        assertEquals(expResult, result);
        //}catch(Exception ex){
          //  fail("Error en prueba de validador de nombre: "+ex);
        //}
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Apellido_Paterno method, of class Entradas.
     */
    @Test
    public void testApellido_Paterno() {
        System.out.println("Apellido_Paterno");
        String AP = "ulfric";
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.Apellido_Paterno(AP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Apellido_Materno method, of class Entradas.
     */
    @Test
    public void testApellido_Materno() {
        System.out.println("Apellido_Materno");
        String AM = "Proud";
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.Apellido_Materno(AM);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Email method, of class Entradas.
     */
    @Test
    public void testEmail() {
        System.out.println("Email");
        String em = "alguien@algo.com";
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.Email(em);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Telefono method, of class Entradas.
     */
    @Test
    public void testTelefono() {
        System.out.println("Telefono");
        int tel = 123456789;
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.Telefono(tel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Monto method, of class Entradas.
     */
    @Test
    public void testMonto() {
        System.out.println("Monto");
        int money = 1000000;
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.Monto(money);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testValidaFecha() {
        System.out.println("validarFecha");
        String fecha = "06/09/2018";
        boolean expResult = true;
        boolean result = Entradas.validarFecha(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
