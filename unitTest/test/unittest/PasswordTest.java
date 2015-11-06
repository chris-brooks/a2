/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christopherbrooks
 */
public class PasswordTest {
    
    public PasswordTest() {
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
     * Test of enterPassword method, of class Password.
     */
    @Test
    public void testEnterPassword() {
        System.out.println("enterPassword");
        Password instance = new Password();
        instance.enterPassword();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validatePassword method, of class Password.
     */
    @Test
    public void testValidatePassword() {
        System.out.println("validatePassword");
        String passwordIn = "";
        Password instance = new Password();
        boolean expResult = false;
        boolean result = instance.validatePassword(passwordIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doubleCheckPassword method, of class Password.
     */
    @Test
    public void testDoubleCheckPassword() {
        System.out.println("doubleCheckPassword");
        String passwordToBeCheckedIn = "";
        Password instance = new Password();
        instance.doubleCheckPassword(passwordToBeCheckedIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
