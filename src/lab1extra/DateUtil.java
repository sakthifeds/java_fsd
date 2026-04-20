package lab1extra;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String getDuration(String inputDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate input = LocalDate.parse(inputDate, formatter);
        LocalDate now = LocalDate.now();
        Period period = Period.between(input, now);
        return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
    }
}

