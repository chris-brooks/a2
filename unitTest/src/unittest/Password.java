/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Christopher Brooks
 */
public class Password {
    
    //must be 8 char
    // at least one capitol letter or one number
    // at least one special char {!,@,#,$,%,^,&,*,(,)}
    
    String password;
    private static String passwordValidatorTokens = "(\\d+ | \\p{Upper}) && [!@#\\$%\\^&\\*)(]";
    
    Scanner keyboardInput = new Scanner(System.in);
    
    //Expect that users will have a .com, .net, or .edu email address
    
    public void enterPassword()
    {
        System.out.println("Enter Password: ");
        password = keyboardInput.next();
        
        validatePassword(password);
    }
    
    //Does not check for a valid email address, only the required TLDs
    public boolean validatePassword(String passwordIn)
    {
        Pattern passwordPattern = Pattern.compile(passwordValidatorTokens, Pattern.CASE_INSENSITIVE);
        
        Matcher m = passwordPattern.matcher(passwordIn);
        
        if(m.find())
        {
            System.out.println("Found match, " + passwordIn + ", with regex validator.");
            return true;
        }
        else
            System.out.println("No matches found.");
        return false;
        
    }
    
    
    
}
