package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingList {
    private static final String[] lyric = {"You", "say", "it", "best",
                        "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {
        List words = new ArrayList();

        for (String w :
                lyric) {
            words.add(w);
        }

        for (Object o :
                words) {
            System.out.println(o + " ");
        }

        System.out.println("\n-------------------");
        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
        System.out.println("Where's [say]?:" + words.indexOf("say"));
        System.out.println("Where's the last [say]?:" + words.lastIndexOf("say"));

        Collections.sort(words);

        for (Object o :
                words) {
            System.out.println(o + " ");
        }

        long start = System.nanoTime();

        long end = System.nanoTime();

        long execution = end - start;
        System.out.println("Execution time: " + execution + "nanosecond");
    }
}
