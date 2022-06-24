package exercise.hashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    Map<Integer, String> map = new HashMap<>();

    public StudentHashMap() {
        long start, end, timeElapsed;
        start = System.nanoTime();
        map.put(10, "Rinuwu");
        map.put(11, "Rinuwu");
        map.put(12, "Rinuwu");
        map.put(13, "Rinuwu");
        map.put(14, "Rinuwu");
        map.put(15, "Rinuwu");
        map.put(16, "Rinuwu");
        map.put(17, "Rinuwu");
        map.put(18, "Rinuwu");
        map.put(19, "Rinuwu");
        map.put(20, "Rinuwu");
        map.put(21, "Rinuwu");
        map.put(22, "Rinuwu");
        map.put(23, "Rinuwu");
        map.put(24, "Rinuwu");
        map.put(25, "Rinuwu");
        map.put(26, "Rinuwu");
        map.put(27, "Rinuwu");
        map.put(28, "Rinuwu");
        map.put(29, "Rinuwu");
        map.put(30, "Rinuwu");
        end = System.nanoTime();
        timeElapsed = end - start;

        System.out.println(map);
        System.out.println(timeElapsed);
    }

    public void check(){

    }
}
