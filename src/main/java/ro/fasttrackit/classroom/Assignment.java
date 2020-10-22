package ro.fasttrackit.classroom;

public class Assignment {
    String id;
    String courseNumber;
    String assignementTitle;
    String assignementDescription;
    String difficultylevel; //parametri

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getAssignementTitle() {
        return assignementTitle;
    }

    public String getAssignementDescription() {
        return assignementDescription;
    }

    public String getDifficultylevel() {
        return difficultylevel;
    }

    public void setAssignementTitle(String assignementTitle) {
        this.assignementTitle = assignementTitle;
    }

    public void setAssignementDescription(String assignementDescription) {
        this.assignementDescription = assignementDescription;
    }

    public void setDifficultylevel(String difficultylevel) {
        this.difficultylevel = difficultylevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

