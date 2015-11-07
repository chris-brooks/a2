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
import java.util.Scanner;

/**
 *
 * @author christopherbrooks
 */
public class PasswordTest {
    
    protected String[] password = {"bobbyQ", "h@ppy123", "qwerty", "Qwerty0!", "ggggg%$12"};
    
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
     * Test of validatePassword method, of class Password.
     */
    @Test
    public void testValidatePassword() {
        System.out.println("validatePassword");
        String passwordIn = password[0];
        Password instance = new Password();
        boolean expResult = false;
        boolean result = instance.validatePassword(passwordIn);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidatePassword1() {
        System.out.println("validatePassword");
        String passwordIn = password[1];
        Password instance = new Password();
        boolean expResult = true;
        boolean result = instance.validatePassword(passwordIn);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidatePassword2() {
        System.out.println("validatePassword");
        String passwordIn = password[2];
        Password instance = new Password();
        boolean expResult = false;
        boolean result = instance.validatePassword(passwordIn);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of doubleCheckPassword method, of class Password.
     */
    @Test
    public void testDoubleCheckPassword() {
        System.out.println("doubleCheckPassword");
        String passwordToBeCheckedIn = password[3];
        Password instance = new Password();
        instance.validatePassword(password[1]);
        // TODO review the generated test code and remove the default call to fail.
        boolean expResult = false;
        boolean result = instance.doubleCheckPassword(passwordToBeCheckedIn);
        assertEquals(expResult, result);
    }
    
}
