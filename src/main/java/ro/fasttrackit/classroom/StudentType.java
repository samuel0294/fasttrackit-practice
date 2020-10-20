package ro.fasttrackit.classroom;

public enum StudentType implements ScholarType{
    BACHELOR,
    MASTERS,
    PHD,
    ;

    @Override
    public String printout() {
        return null;
    }
}
