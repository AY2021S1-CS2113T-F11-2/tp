package seedu.duke;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class Duke {

    Scanner in = new Scanner(System.in);
    Parser parser = new Parser();
    Ui ui = new Ui();
    String userCommand;

    void run() {
        while (!parser.isExit) {
            userCommand = in.nextLine();
            parser.parse(userCommand);
        }
    }

    public static void main(String[] args) {
        Ui.printWelcomeMessage();
        Ui.printHelpMessage();
        new Duke().run();
    }
}
