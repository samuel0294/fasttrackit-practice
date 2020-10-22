package ro.fasttrackit.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class DifficultyLevel implements Comparator<Assignment> {
    @Override
    public int compare(Assignment o1, Assignment o2) {
        return 0;
    }

    @Override
    public Comparator<Assignment> reversed() {
        return null;
    }

    @Override
    public Comparator<Assignment> thenComparing(Comparator<? super Assignment> other) {
        return null;
    }

    @Override
    public <U> Comparator<Assignment> thenComparing(Function<? super Assignment, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Assignment> thenComparing(Function<? super Assignment, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Assignment> thenComparingInt(ToIntFunction<? super Assignment> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Assignment> thenComparingLong(ToLongFunction<? super Assignment> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Assignment> thenComparingDouble(ToDoubleFunction<? super Assignment> keyExtractor) {
        return null;
    }
    private static ArrayList<Assignment> createArraylist(){
        ArrayList<Assignment> assignment = new ArrayList<Assignment>();
        Assignment assignment1 = new Assignment();
        assignment1.setCourseNumber("1");
        assignment1.setDifficultylevel("easy");
        Assignment assignment2 = new Assignment();
        assignment2.setCourseNumber("2");
        assignment2.setDifficultylevel("medium");
        Assignment assignment3 = new Assignment();
        assignment3.setCourseNumber("3");
        assignment3.setDifficultylevel("hard");
        assignment.add(assignment1);
        assignment.add(assignment2);
        assignment.add(assignment3);

        System.out.println("Before Sorting : "+ assignment);
        DifficultyLevel comparator = new DifficultyLevel();
        Collections.sort(assignment, comparator);
        System.out.println("After sorting : " + assignment);


        return assignment;
    }
    }
