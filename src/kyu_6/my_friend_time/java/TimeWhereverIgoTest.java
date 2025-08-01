package kyu_6.my_friend_time.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeWhereverIgoTest {
    @Test
    void sampleTests() {
        assertEquals("27-03-2021 21:41", TimeWhereverIgo.getFriendDateAndTime("27-03-2021 19:41", "Europe/Warsaw", "Africa/Asmera"));
        assertEquals("28-03-2021 05:41", TimeWhereverIgo.getFriendDateAndTime("27-03-2021 19:41", "Europe/Warsaw", "Australia/Sydney"));
        assertEquals("28-03-2021 10:41", TimeWhereverIgo.getFriendDateAndTime("28-03-2021 19:41", "Australia/Sydney", "Europe/Warsaw"));
        assertEquals("19-03-2021 12:01", TimeWhereverIgo.getFriendDateAndTime("19-03-2021 01:01", "America/Halifax", "Asia/Makassar"));
        assertEquals("01-12-2021 00:00", TimeWhereverIgo.getFriendDateAndTime("01-12-2021 00:00", "Europe/Dublin", "Europe/Belfast"));
        assertEquals("07-12-2019 11:59", TimeWhereverIgo.getFriendDateAndTime("07-12-2019 23:59", "Pacific/Fiji", "Europe/Berlin"));
        assertEquals("07-12-2021 12:59", TimeWhereverIgo.getFriendDateAndTime("07-12-2021 23:59", "Pacific/Fiji", "Europe/Berlin"));
    }
}
