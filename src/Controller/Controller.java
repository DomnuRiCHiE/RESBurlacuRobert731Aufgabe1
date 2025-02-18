package Controller;

import Model.Log;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The Controller manages the application logic.
 */
public class Controller {
    private final List<Log> logEntries;

    public Controller(List<Log> logEntries) {
        this.logEntries = logEntries;
    }

//    public List<String> getLogsByLetter(String letter) {
//        Set<String> uniqueLogs = new HashSet<>();
//        for (Log entry : logEntries) {
//            String processedLog = entry.getMitgliedsname();
//            if (processedLog.startsWith(String.valueOf(letter))) {
//                uniqueLogs.add(processedLog);
//            }
//        }
//        return new ArrayList<>(uniqueLogs);
//    }

//    public List<Log> getLogsSortedByX() {
//        return logEntries.stream()
//                .filter(p -> p.getHaus() == Haus.Stark)
//                .sorted(Comparator.comparing(Log::getDatum))
//                .toList();
//    }

//    public List<String> getLogsByX() {
//        Map<Haus, Long> processedLogs = logEntries.stream()
//                .collect(Collectors.groupingBy(
//                        Log::getHaus,
//                        Collectors.counting()
//                ));
//
//        return processedLogs.entrySet().stream()
//                .sorted((entry1, entry2) -> {
//                    int countComparison = entry2.getValue().compareTo(entry1.getValue());
//                    if(countComparison != 0) {
//                        return countComparison;
//                    }
//                    return entry1.getKey().toString().compareTo(entry2.getKey().toString());
//                })
//                .map(entry -> entry.getKey() + "#" + entry.getValue())
//                .toList();
//    }
}
