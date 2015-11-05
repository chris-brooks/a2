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
class UserId {
    
    
    String email;
    String delimiters = "[.]";
    String[] parsedUserId;
    
    //Expect that users will have a .com, .net, or .edu email address
    private static String emailValidatorTokens = ".com$|.net$|.edu$";
    
    Scanner keyboardInput = new Scanner(System.in);
    
    
    
    public void login()
    {
        System.out.println("Enter User ID: ");
        email = keyboardInput.next();
        
        validateEmail(email);
    }
    
    public void login(String userIdIn)
    {
        System.out.println("Enter User ID: ");
        validateEmail(userIdIn);
    }
    
    //Does not check for a valid email address, only the required TLDs
    public boolean validateEmail(String userId)
    {
        Pattern emailPattern = Pattern.compile(emailValidatorTokens, Pattern.CASE_INSENSITIVE);
        
        Matcher m = emailPattern.matcher(userId);
        
        if(m.find())
        {
            System.out.println("Found match, " + userId + ", with regex validator.");
            return true;
        }
        else
            System.out.println("No matches found.");
        return false;
        
    }
    
}
