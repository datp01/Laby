package practice.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingLinkedHashMap {
    private static final  String[] names = {"Mercury",  "Venus", "Earth",
            "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

    private static final float[] diameters = { 4800f, 12103.6f, 12756.3f, 6794f, 142984f
            , 120536f, 51118f, 49532f, 2274f };

    public static void main(String[] args) {
        Map planets = new LinkedHashMap();

        for (int i = 0; i < names.length; i++) {
            planets.put(names[i], diameters[i]);
        }

        for (Object o :
                planets.entrySet()) {
            Map.Entry e = (Map.Entry) o;
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        System.out.println("----------------------------------");

        while (true) {
            System.out.println("Find planet (ENTER to quit)");
            String name = (new Scanner(System.in)).nextLine();
            if (name.length() == 0) {
                break;
            } else if (!planets.containsKey(name)) {
                System.out.println("Planet" + name + " not found!");
            } else {
                System.out.println("The diameter of " + name + " is " + planets.get(name));
            }
        }
        long start = System.nanoTime();

        long end = System.nanoTime();

        long execution = end - start;
        System.out.println("Execution time: " + execution + "nanosecond");
    }
}
