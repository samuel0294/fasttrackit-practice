package ro.fasttrackit.classroom;

import java.time.LocalDate;

public class Profesor extends Human {
    private String lastName;
    private String firstName;
    private LocalDate dateobirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    public Boolean isPhd;

    void isPhd() {

    }

    public static void main(String[] args) {

    }
}

class PhdProfessor extends Profesor {
    @Override
    void isPhd() {
        super.isPhd();
    }
}