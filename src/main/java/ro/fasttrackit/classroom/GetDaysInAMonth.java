package ro.fasttrackit.classroom;


import java.util.Calendar;
public class GetDaysInAMonth {
    public static void main(String[] args)
        {
            Calendar calendar = Calendar.getInstance();
            int year = 2022;
            int month = Calendar.MARCH;
            int date = 1;
            calendar.set(year, month, date);
            int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("Number of Days: " + days);
        }
    }

