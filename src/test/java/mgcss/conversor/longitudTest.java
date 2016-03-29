/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgcss.conversor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vicky
 */
public class longitudTest {
    
    public longitudTest() {
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
     * Test of milla method, of class longitud.
     */
    @Test
    public void testMilla1() {
    try{
        double milla = 1;
        double expResult = 1.61;
        double result = longitud.milla(milla);
        assertEquals(expResult, result, 0.0);
        
        }catch(Exception e) {fail("fallo");}
        
    }
   @Test
    public void testMilla2() {
    try{
        double milla = 100;
        double expResult = 161;
        double result = longitud.milla(milla);
        assertEquals(expResult, result, 0.0);
        
        }catch(Exception e) {fail("fallo");}
        
    }
    @Test
    public void testMilla3() {
    try{
        double milla = 4;
        double expResult = 6.44;
        double result = longitud.milla(milla);
        assertEquals(expResult, result, 0.0);
        
        }catch(Exception e) {fail("fallo");}
        
    }
}
