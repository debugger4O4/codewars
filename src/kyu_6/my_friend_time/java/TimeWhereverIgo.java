// https://www.codewars.com/kata/605f7759c8a98c0023833718/train/java

package kyu_6.my_friend_time.java;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeWhereverIgo {

    private static final DateTimeFormatter INPUT_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public static String getFriendDateAndTime(String myTime, String myZone, String friendZone) {
        LocalDateTime localDateTime = LocalDateTime.parse(myTime, INPUT_FORMATTER);
        ZonedDateTime inMyZone = ZonedDateTime.of(localDateTime, ZoneId.of(myZone));
        ZonedDateTime friendsTime = inMyZone.withZoneSameInstant(ZoneId.of(friendZone));
        return friendsTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }
}
