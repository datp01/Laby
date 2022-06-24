package practice;

import java.util.HashSet;
import java.util.Set;

public class UsingHashSet {
    private static final String[] lyric = {"You", "say", "it", "best",
            "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {
        Set words = new HashSet<>();

        for (String w :
                lyric) {
            words.add(w);
        }

        for (Object o :
                words) {
            System.out.println(o + " ");
        }

        System.out.println("\n--------------------");
        System.out.println("Contains [you]?: " + words.contains("you"));
        System.out.println("Contains [me]?: " + words.contains("me"));


    }
}
