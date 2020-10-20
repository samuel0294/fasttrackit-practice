package ro.fasttrackit.classroom;

import java.time.LocalDate;

public class Student extends Human implements Humann {
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private String emailAdress;
    private Float grade;
    private Boolean finishedClass;
    private Object StudentType;

    public Student(String lastName, String firstName,
                   LocalDate dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth =dateOfBirth;
    }
    public static void main(String[] args) {
    }

    @Override
    public String getSomethingToSay() {
        return null;
    }

    @Override
    public Object getType() {
        return StudentType;
    }
}



