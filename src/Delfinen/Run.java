package Delfinen;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Run {

    UserInterface ui = new UserInterface();
    Log log = new Log();

    void run() throws FileNotFoundException {
        ui.start();
        switchMenu();

        ui.exit();


    }

    void switchMenu() throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int choice = 50;
        while (choice != 0) {
            ui.printMain();
            choice = in.nextInt();
            switch (choice) {
                case 1 -> log.saveMembers();
                case 2 -> log.loadMembers();
                case 3 -> log.calcPayment();
                case 4 -> log.topFive();
                case 5 -> log.addMember();
                case 6 -> log.removeMember();
                case 7 -> log.displayMember();
                case 0 -> ui.exit();
                default -> System.out.println("unknown command");
            }
        }
    }
}
