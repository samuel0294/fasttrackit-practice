package ro.fasttrackit.classroom;

import java.time.LocalDate;

public class Profesor extends Human implements Humann {
    private String lastName;
    private String firstName;
    private LocalDate dateobirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    public Boolean isPhd;
    private Object ProfesorType;

    void isPhd() {

    }

    public static void main(String[] args) {

    }

    @Override
    public String getSomethingToSay() {
        return null;
    }

    @Override
    public Object getType() {
        return ProfesorType;
    }
}

class PhdProfessor extends Profesor {
    @Override
    void isPhd() {
        super.isPhd();
    }

    public static void main(String[] args) {

    }
}



