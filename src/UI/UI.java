package UI;

import Model.Log;

import Controller.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import static Model.FileFunctionalities.writeToFile;

/**
 * UI provides a menu-driven interface for interacting with Controller.
 */
public class UI {
    private final Controller controller;
    private final Scanner scanner;

    public UI(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Main menu for console application
     *
     * @throws IOException when results cannot be inserted in file
     */
    public void menu() throws IOException {
        while (true) {
            System.out.println();
            System.out.println("1. Task 2");
            System.out.println("2. Task 3");
            System.out.println("3. Task 4");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    handleLogsByLetter();
                    break;
                case "2":
                    printLogs(controller.getLogsSortedByX());
                    break;
                case "3":
                    printLogsByX();
                    System.out.println("Done");
                    break;
                case "4":
                    System.out.println("Exiting the application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    /**
     * Handles option to display logs whose names start with a specific letter
     */
    private void handleLogsByLetter() {
        System.out.print("Enter a capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();
        List<Log> logs = controller.getLogsByCapacity(capacity);
        for(Log log : logs) {
            System.out.println(log.getCharakterName());
        }
    }

    /**
     * Prints a list of logs
     *
     * @param logs list of logs
     */
    private void printLogs(List<Log> logs) {
        if (logs.isEmpty()) {
            System.out.println("No logs found.");
        } else {
            for(Log log : logs) {
                System.out.println(log.getDatum() + ": " + log.getCharakterName() + " - " + log.getBeschreibung());
            }
        }
    }

    /**
     * Prints Logs to file
     *
     * @throws IOException when logs cannot be printed to file
     */
    private void printLogsByX() throws IOException {
        writeToFile(controller.getLogsByX(), "gesammtzahl.txt");
    }
}
