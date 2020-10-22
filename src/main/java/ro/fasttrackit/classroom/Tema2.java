package ro.fasttrackit.classroom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

public class Tema2 {

    private static ArrayList<Assignment> createArraylist(){
        ArrayList<Assignment> assignment = new ArrayList<Assignment>();
        Assignment assignment1 = new Assignment(); // instantiere a unui obiect
        assignment1.setId("id1"); //am setat id-ul obiectului
Assignment assignment2 = new Assignment();
assignment2.setId("id2");
Assignment assignment3 = new Assignment();
assignment3.setId("id3");
assignment.add(assignment1);
assignment.add(assignment2);
assignment.add(assignment3); // am adaugat un obiect de tip assignement in lista

        System.out.println("Before Sorting :" + assignment);
        Collections.sort(assignment);
        System.out.println("After Sorting : " + assignment);

        return assignment; //parametru;variabila
    }
}
