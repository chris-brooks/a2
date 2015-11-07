/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import java.util.Scanner;

/**
 *
 * @author Christopher Brooks
 */
public class UnitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboardInput = new Scanner(System.in);
       
        
        
        //Create a new login object, contains userud
        UserId user = new UserId();
        
        //call the login logic
        System.out.println("Enter User ID: ");
        String input = keyboardInput.next();
        user.validateEmail(input);
        
        Password pw = new Password();
        System.out.print("Enter Password: ");
        
    }
    
}
