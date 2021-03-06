package ro.fasttrackit.classroom.c08;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a password.");
        Scanner sc = new Scanner(System.in);

        String password = sc.next();


            validatePassword(password);
    }

    static void validatePassword(String password) throws Exception {
        if (password.length() < 12) {
            throw new PasswordException("Password length is less than 12");
        }

        boolean upperCheck = false;
        boolean lowerCheck = false;
        boolean digitCheck = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) // This verifies there is a uppercase letter
            {
                upperCheck = true;
            }

            if (Character.isLowerCase(c)) // This verifies there is a lowercase letter
            {
                lowerCheck = true;
            }
            if (Character.isDigit(c)) // This verifies there is a digit
            {
                digitCheck = true;
            }
        }

        if (!upperCheck) {
            throw new PasswordException("There must be an uppercase character");
        }

        if (!lowerCheck) {
            throw new PasswordException ("There must be a lowercase character");
        }

        if (!digitCheck) {
            throw new PasswordException ("There must a be 3 digits");
        }

        System.out.println("Valid password.");
    }
}
