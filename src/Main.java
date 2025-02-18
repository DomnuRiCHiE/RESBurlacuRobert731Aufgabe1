import Model.Log;
import Model.LogParser;
import Model.LogParserFactory;

import Controller.Controller;
import UI.UI;

import java.util.List;

/**
 * Main program class
 */
public class Main {
    public static void main(String[] args) {
        try {
            LogParser parser = LogParserFactory.getParser("json");
            List<Log> logEntries = parser.parse("ninja_events.json");

            Controller controller = new Controller(logEntries);
            UI ui = new UI(controller);

            for(Log log : logEntries) {
                System.out.println(log);
            }

            ui.menu();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
