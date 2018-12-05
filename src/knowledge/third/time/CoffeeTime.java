package knowledge.third.time;

import java.time.*;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class CoffeeTime {

    public static void hello() {
        LocalDate ld = LocalDate.of(2018, 6, 12);
        ld = ld.plusDays(365).plusMonths(12).plusWeeks(1).plusYears(1);
        System.out.println(ld);

        LocalTime lt = LocalTime.of(1, 0, 0);
        lt = lt.plusNanos(0).plusSeconds(60).plusMinutes(60).plusHours(1);
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        ldt = ldt.minusHours(26).minusMonths(6);
        System.out.println(ldt);
    }

    public static void theSameAsHello() {
        LocalDate ld = LocalDate.of(2018, 6, 12);
        ld = ld.plus(Period.ofDays(365));
        ld = ld.plus(Period.ofMonths(12));
        ld = ld.plus(Period.ofWeeks(1));
        ld = ld.plus(Period.ofYears(1));
        System.out.println(ld);

        LocalTime lt = LocalTime.of(1, 0, 0);
        lt = lt.plus(Duration.ofHours(2));
        lt = lt.plus(Duration.ofSeconds(60));
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        ldt = ldt.minusHours(2).minusMonths(6);
        ldt = ldt.minus(Period.ofDays(1));
        System.out.println(ldt);

        Period p = Period.of(1,1,1);
        System.out.println(p);
    }

    public static Date asDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date asDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate asLocalDate(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDateTime asLocalDateTime(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static void main(String[] args) {

        hello();
        System.out.println();
        theSameAsHello();

        LocalDate localDate = LocalDate.now();
        System.out.println(asDate(localDate).toString());
    }
}

