package ro.fasttrackit.classroom.c08;

public class PasswordException extends Exception {


    public PasswordException() {
        super("Invalid password");
    }

    public PasswordException(String message) {
        super("Invalid password: " + message);
    }
}

