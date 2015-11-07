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
 * @author Christopher Brooks
 */
public class UserIdTest {
    protected String[] userId = {"me.no", "myemail@email.co.uk", "cmbrooks2@alaska.edu", "email@aol.com", "youcanfly12@gci.net"};
    protected String[] password = {"bobbyB", "h@ppy123", "qwerty", "Qwerty0!", "ggggg%$12"};
    
    public UserIdTest() {
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
     * Test of validateEmail method, of class UserId.
     */
    @Test
    public void testValidateEmail_String() {
        System.out.println("login");
        String userIdIn = userId[0];
        UserId instance = new UserId();
        boolean expResult = false;
        boolean result = instance.validateEmail(userIdIn);
        assertEquals(expResult, result);
    }

@Test
    public void testValidateEmail_String1() {
        System.out.println("login");
        String userIdIn = userId[1];
        UserId instance = new UserId();
        boolean expResult = false;
        boolean result = instance.validateEmail(userIdIn);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidateEmail_String2() {
        System.out.println("login");
        String userIdIn = userId[2];
        UserId instance = new UserId();
        boolean expResult = true;
        boolean result = instance.validateEmail(userIdIn);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidateEmail_String3() {
        System.out.println("login");
        String userIdIn = userId[3];
        UserId instance = new UserId();
        boolean expResult = true;
        boolean result = instance.validateEmail(userIdIn);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidateEmail_String4() {
        System.out.println("login");
        String userIdIn = userId[4];
        UserId instance = new UserId();
        boolean expResult = true;
        boolean result = instance.validateEmail(userIdIn);
        assertEquals(expResult, result);
    }
    
}
