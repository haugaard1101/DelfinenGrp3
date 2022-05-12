package Delfinen;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Run {

    Userinterface ui = new Userinterface();
    Log log = new Log();

    void run() {
        ui.start();

        ui.exit();


    }

    void bla() throws FileNotFoundException {
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
                case 0 -> ui.exit();
                default -> System.out.println("unknown command");
            }
        }
    }
}
