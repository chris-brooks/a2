/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Christopher Brooks
 */
class UserId {
    
    String email;
    
    //Expect that users will have a .com, .net, or .edu email address
    private final String emailValidatorTokens = ".com$|.net$|.edu$";
    
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
