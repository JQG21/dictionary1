package com.example.dictionary1.word;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class WordContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<WordItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, WordItem> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem("0","s","0s","00s");
        addItem("1","a","a1","1aa1");
        addItem("2","b","b2","2bb2");
        addItem("3","c","3c","3cc3");
        addItem("4","d","4d","4dd4");
    }

    private static void addItem(String id,String word,String meaning,String sample) {
        WordItem wordItem = new WordItem(id,word,meaning,sample);
    }

    /*
    private static WordItem createWordItem(int position) {
        return new WordItem(String.valueOf(position), "Item " + position, makeDetails(position),);
    }
*/
    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class WordItem implements Serializable {
        public final String id;
        public final String word;
        public final String meaning;
        public final String sample;

        public WordItem(String id,String word, String meaning, String sample) {
            this.id = id;
            this.word = word;
            this.meaning = meaning;
            this.sample = sample;
        }

        @Override
        public String toString() {
            return meaning;
        }
    }
}