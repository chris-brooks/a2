/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author Christopher Brooks
 */
public class UnitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create a new login object, contains userud
        UserId user = new UserId();
        
        //call the login logic
        user.login();
        
        Password pw = new Password();
        
        pw.enterPassword();
        
    }
    
}
