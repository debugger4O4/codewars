// https://www.codewars.com/kata/58e0534a95923f0820000013/train/java

package kyu_6.how_many_working_days.java;

import java.time.LocalDate;
import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.temporal.ChronoUnit.WEEKS;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previousOrSame;

class WorkingDays {
    static long count(final LocalDate start, final LocalDate end) {
        final LocalDate startMonday = start
                .with(nextOrSame(MONDAY));
        final LocalDate endFriday = end
                .with(lastDayOfMonth())
                .with(previousOrSame(FRIDAY));
        return 5 * (WEEKS.between(startMonday, endFriday) + 1);
    }
}