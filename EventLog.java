package igrica;

import java.util.ArrayList;
import java.util.List;

public class EventLog {
    private static final List<String> logs = new ArrayList<>();

    public static void add(String message) {
        logs.add(message);
    }

    public static void print() {
        System.out.println("\n--- Event Log ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}