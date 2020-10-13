package ro.fasttrackit.classroom;

import java.time.LocalDate;

public class Student extends Human {
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private String emailAdress;
    private Float grade;
    private Boolean finishedClass;

    public Student(String lastName, String firstName,
                   LocalDate dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth =dateOfBirth;
    }

    public static void main (String[]args){
    }
}



