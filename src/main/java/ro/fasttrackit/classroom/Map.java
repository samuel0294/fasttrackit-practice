package ro.fasttrackit.classroom;

import java.util.HashMap;
import java.util.Objects;

public class Map {
    private String CourseNumber;
    private String DifficultyLevel;

    private String getCourseNumber() {return CourseNumber;}
    private String getDifficultyLevel() {return DifficultyLevel;}

    public void setCourseNumber(String courseNumber) { CourseNumber = courseNumber;}

    public void setDifficultyLevel(String difficultyLevel) { DifficultyLevel = difficultyLevel;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Map map = (Map) o;
        return Objects.equals(CourseNumber, map.CourseNumber) &&
                Objects.equals(DifficultyLevel, map.DifficultyLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CourseNumber, DifficultyLevel);
    }

    public static void main(String[] args) {
        HashMap<String,String> collection = new HashMap<String,String>();
        collection.put("uniquie elements", "uniqueid");
        collection.put("courseNumber", "difficultyLevel");
        collection.put("courseNumber", "assignmentTitle");

    }
}
