//package com.example.startapp006.dummy;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Helper class for providing sample content for user interfaces created by
// * Android template wizards.
// * <p>
// * TODO: Replace all uses of this class before publishing your app.
// */
//public class LessonsContent {
//
//    /**
//     * An array of sample (dummy) items.
//     */
//    public static final List<Lesson> ITEMS = new ArrayList<Lesson>();
//
//    /**
//     * A map of sample (dummy) items, by ID.
//     */
//    public static final Map<String, Lesson> ITEM_MAP = new HashMap<String, Lesson>();
//
//    private static final int COUNT = 25;
//
//    static {
//        // Add some sample items.
//        addItem(new Lesson("0", "вводный урок андроид"));
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(createDummyItem(i));
//        }
//    }
//
//    private static void addItem(Lesson item) {
//        ITEMS.add(item);
////        ITEM_MAP.put(item.id, item);
//    }
//
//    private static Lesson createDummyItem(int position) {
//        return new Lesson(String.valueOf(position), "Lesson " + position);
//    }
//
//    private static String makeDetails(int position) {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Details about Item: ").append(position);
//        for (int i = 0; i < position; i++) {
//            builder.append("\nMore details information here.");
//        }
//        return builder.toString();
//    }
//
//    /**
//     * A dummy item representing a piece of content.
//     */
//    public static class Lesson {
//        public final String id;
//        public final String description;
//
//        public Lesson(String id, String description) {
//            this.id = id;
//            this.description = description;
//        }
//
//        @Override
//        public String toString() {
//            return description;
//        }
//    }
//}