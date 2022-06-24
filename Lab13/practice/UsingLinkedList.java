package practice;

import java.util.Collections;
import java.util.LinkedList;

public class UsingLinkedList {
    private static final String[] lyric = {"You", "say", "it", "best",
            "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {
        LinkedList words = new LinkedList<>();

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
