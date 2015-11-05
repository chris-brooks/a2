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

    private static final String passwordRegex = "^(?=.*[0-9] || ?=.*[A-Z])(?=.*[!@#$%^&*()])(?=\\S+$).{8,}$";

    Scanner keyboardInput = new Scanner(System.in);

    public void enterPassword() {
        System.out.print("Enter Password: ");
        password = keyboardInput.next();

        validatePassword(password);
    }

    //Does not check for a valid email address, only the required TLDs
    public boolean validatePassword(String passwordIn) {
        Pattern passwordPattern = Pattern.compile(passwordRegex, Pattern.CASE_INSENSITIVE);

        Matcher m = passwordPattern.matcher(passwordIn);

        if (m.find()) {
            System.out.println("Found match, " + passwordIn + ", with regex validator.");
            doubleCheckPassword(passwordIn);
            return true;
        } else {
            System.out.println("No matches found.");
        }
        return false;

    }
    
    public void doubleCheckPassword(String passwordToBeCheckedIn) {
        System.out.print("Enter password again: ");
        String password2 = keyboardInput.next();
        if(password2 == passwordToBeCheckedIn) {
            System.out.println("Passwords match! Thank you!!");
        } else {
            System.out.println("Passwords do not match. Try again.");
        }
    }
    
    

}
