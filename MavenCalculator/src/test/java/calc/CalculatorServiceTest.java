/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigoreg
 */
public class CalculatorServiceTest {
    
    public CalculatorServiceTest() {
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
     * Test of add method, of class CalculatorService.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        int x = 0;
        int y = 0;
        CalculatorService instance = new CalculatorService();
        int expResult = 0;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logServer method, of class CalculatorService.
     */
    @Test
    public void testLogServer() {
        System.out.println("logServer");
        String text = "";
        CalculatorService instance = new CalculatorService();
        instance.logServer(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
