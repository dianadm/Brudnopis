package knowledge.third.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class IhaveTime {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
//        System.out.println(formatter.format(localDate)); // UnsupportedTemporalTypeException: Unsupported field: ClockHourOfAmPm
        System.out.println(formatter.format(localDateTime));

        localDate = localDate.plusDays(2);
        Period period = Period.ofMonths(1);
        localDate = localDate.plus(period);
        System.out.println(localDate);

        LocalDateTime localDateTime1 = LocalDateTime.of(2017, Month.APRIL, 11, 20, 0);

    }
}
