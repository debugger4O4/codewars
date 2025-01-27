// https://www.codewars.com/kata/59b47ff18bcb77a4d1000076/train/java

package kyu_2.blaine_is_a_pain.java;

import java.awt.Point;
import java.util.*;
import java.util.stream.*;

public class Dinglemouse {

    public static int trainCrash(final String track, final String aTrain, final int aTrainPos, final String bTrain,
                                 final int bTrainPos, final int limit) {
        return new TheIncident(track, aTrain, aTrainPos, bTrain, bTrainPos, limit).crash();
    }
}


class TheIncident {

    final private static Map<Character, Point[][]> MOVES = new HashMap<Character, Point[][]>() {{
        put('/', new Point[][]{new Point[]{new Point(0, -1), new Point(1, -1), new Point(1, 0)},
                new Point[]{new Point(-1, 0), new Point(-1, 1), new Point(0, 1)}});
        put('\\', new Point[][]{new Point[]{new Point(0, 1), new Point(1, 1), new Point(1, 0)},
                new Point[]{new Point(-1, 0), new Point(-1, -1), new Point(0, -1)}});
    }};
    final private static Map<Character, char[][]> TARGET_CHAR = new HashMap<Character, char[][]>() {{
        put('/', new char[][]{new char[]{'-', '/', '|'}, new char[]{'|', '/', '-'}});
        put('\\', new char[][]{new char[]{'-', '\\', '|'}, new char[]{'|', '\\', '-'}});
    }};

    private final List<Train> trains;
    private Track[] tracks;
    private final int limit;


    public TheIncident(final String track, final String aTrain, final int aPos, final String bTrain, final int bPos, final
    int limit) {
        this.limit = limit;
        trackBuilder(track);
        trains = Arrays.asList(new Train(aPos, aTrain, tracks),
                new Train(bPos, bTrain, tracks));
    }


    private void trackBuilder(String track) {

        Stream.Builder<Track> builder = Stream.builder();
        Map<Point, Track> link = new HashMap<>();
        char[][] arr = Arrays.stream(track.split("\n", -1))
                .map(String::toCharArray).toArray(char[][]::new);

        Point move = new Point(0, 1),
                pos = new Point(0, IntStream.range(0, arr[0].length)
                        .filter(n -> arr[0][n] != ' ' && arr[0][n] != '\n').findFirst().getAsInt()), start = new Point(pos);

        for (int p = 0; true; p++) {
            char c = arr[pos.x][pos.y];
            Track t = new Track(pos.x, pos.y, c);

            if ("+XS".contains("" + c)) {
                if (link.containsKey(pos))
                    t = link.get(pos);
                else link.put(pos, t);
            }
            builder.accept(t);

            if (p != 0 && (c == '/' || c == '\\')) {
                int idx = getIndexRelativeToMove(c, move);
                final Point pp = new Point(pos);
                final Point[] m = MOVES.get(c)[idx];
                final char[] tc = TARGET_CHAR.get(c)[idx];
                move = IntStream.range(0, 3).filter(i -> 0 <= pp.x + m[i].x && pp.x + m[i].x < arr.length && 0 <= pp.y
                        + m[i].y && pp.y + m[i].y < arr[pp.x + m[i].x].length && ("XS" + tc[i]).contains("" + arr[pp.x
                        + m[i].x][pp.y + m[i].y])).mapToObj(i -> m[i]).findFirst().get();
            }
            pos = new Point(pos.x + move.x, pos.y + move.y);
            if (pos.equals(start)) break;
        }
        tracks = builder.build().toArray(Track[]::new);
    }

    private int getIndexRelativeToMove(char c, Point m) {
        return c == '/' ? (m.x - m.y > 0 ? 0 : 1) : (m.x + m.y > 0 ? 0 : 1);
    }


    public int crash() {
        for (int round = 0; round <= limit; round++) {
            if (trains.stream().anyMatch(Train::checkSelf) || trains.get(0).checkCrash(trains.get(1)))
                return round;
            trains.forEach(Train::move);
        }
        return -1;
    }
}


class Track extends Point {

    protected boolean isStation;
    protected char c;

    public Track(int x, int y, char c) {
        super(x, y);
        isStation = c == 'S';
        this.c = c;
    }

    @Override
    public String toString() {
        return "" + c;
    }
}


class Train {

    protected Track[] tracks;
    protected boolean isExpress;
    protected int position, dir, length, delay = 0;
    protected char c;
    protected Set<Track> occupy;

    public Train(int position, String s, Track[] tracks) {
        this.position = position;
        this.dir = Character.isUpperCase(s.charAt(0)) ? -1 : 1;
        this.length = s.length();
        this.isExpress = Character.toLowerCase(s.charAt(0)) == 'x';
        this.tracks = tracks;
        this.c = s.charAt(0);
        update();
    }

    private void update() {
        occupy = IntStream.range(0, length).map(x -> (position - dir * x + tracks.length) % tracks.length).mapToObj(i -> tracks[i]).collect(Collectors.toSet());
    }

    public void move() {
        if (delay != 0) delay--;
        else {
            position = (position + dir + tracks.length) % tracks.length;
            delay = tracks[position].isStation && !isExpress ? length - 1 : 0;
        }
        update();
    }

    public boolean checkSelf() {
        return occupy.size() != length;
    }

    public boolean checkCrash(Train o) {
        return occupy.stream().anyMatch(t -> o.occupy.contains(t));
    }
}