package ro.fasttrackit.classroom;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a Password: ");
        String password = input.next();
        if (isValid(password)) {
        System.out.println("is Valid");
        } else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean isValid(String password)
    {

        if (!((password.length() < 12)
                )) {
            System.out.println("password must contain at least 12 characters");
            return false;

        }

        if (true) {
            int count = 0;


            for (int i = 0; i <= 9; i++) {


                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 3;
                }
            }
            if (count == 0) {
                System.out.println("password must contain at least 3 digits");
                return false;
            }
        }


        if (true) {
            int count = 0;


            for (int i = 65; i <= 90; i++) {

                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                System.out.println("Password must contain at least one capital letter.");
                return false;
            }
        }
        if (true) {
            int count = 0;


            for (int i = 90; i <= 122; i++) {


                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                System.out.println("Password must contain at least one lower case letter.");
                return false;
            }
        }

        // if all conditions fails
        return true;
    }
}

