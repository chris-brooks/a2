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
public class UnitTestTest {
    protected String[] userId = {"me.com", "myemail@email.co.uk", "cmbrooks2@alaska.edu", "email@aol.com", "youcanfly12@gci.net"};
    protected String[] password = {"bobbyB", "h@ppy123", "qwerty", "Qwerty0!", "ggggg%$12"};
    


    /**
     * Test of main method, of class UnitTest.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UnitTest.main(args);
        
        UserId user = new UserId();
        Password pw = new Password();
        
        
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
