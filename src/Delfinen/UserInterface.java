package Delfinen;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInterface {


    private final Scanner in = new Scanner(System.in);
    private String decision;
    private int decisionNumb;
    private final DataBase application;
    private boolean decisionBoolean;

    public void save() throws FileNotFoundException { //TODO skal udskrive noget relevant tekst
        System.out.println("something");
        application.saveMembers();
    }

    public void load() throws FileNotFoundException { //TODO skal udskrive noget relevant tekst
        System.out.println("something");
        application.loadMembers();
    }

    public void topFive() { //TODO skal udskrive noget relevant tekst
        System.out.println("something");
        application.topFive();
    }

    public void list() { //TODO kan have en tekst, men er ikke en prioritet
        for (Member member : application.getAllMembers()) {
            System.out.println(member);
        }
    }

    public void delete() {
        System.out.print("Enter Id of member you want to delete: ");
        int id = in.nextInt();
        boolean del = application.removeMember(id);
        if (del) {
            System.out.println("The member with Id " + id + " has been deleted");
        } else {
            System.out.println("The member with Id " + id + " dose not exist");
        }

    }

    public void create() {
        System.out.println("create new member");
        System.out.print("name: ");
        String name = application.nameFailSafe();
        System.out.print("Date of birth(yyyy-mm-dd): "); //Mangler failsafe
        String dateOfBirth = application.dateOfBirthFailSafe();
        System.out.print("are you passive: "); // TODO skal udskrive noget andet end "are you passive"
        boolean isPassive = application.passiveFailSafe();

        application.addMember(name, dateOfBirth, isPassive);
    }

    public void subscription() {
        System.out.println("The total payment: " + application.calcTotalPayment());
    }

    public UserInterface(DataBase application) {
        this.application = application;
    }

    public String getDecision() {
        decision = in.next();
        decision = decision.toLowerCase();
        return decision;
    }

    public boolean getDecisionBoolean() {
        decisionBoolean = in.nextBoolean();
        return decisionBoolean;
    }

    public int getDecisionNumb() {
        decisionNumb = in.nextInt();
        return decisionNumb;
    }

    public void start() {
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tWELCOME TO: ");
        System.out.println("""
                 ____                                                    _      _           _       _                     \s
                 / ___|  __   __   ____    _ __ ___    _ __ ___     ___  | | __ | |  _   _  | |__   | |__     ___   _ __   \s
                 \\___ \\  \\ \\ / /  / _//\\  | '_ ` _ \\  | '_ ` _ \\   / _ \\ | |/ / | | | | | | | '_ \\  | '_ \\   / _ \\ | '_ \\  \s
                  ___) |  \\ V /  | (//) | | | | | | | | | | | | | |  __/ |   <  | | | |_| | | |_) | | |_) | |  __/ | | | | \s
                 |____/    \\_/    \\//__/  |_| |_| |_| |_| |_| |_|  \\___| |_|\\_\\ |_|  \\__,_| |_.__/  |_.__/   \\___| |_| |_| \s
                                                                                                                           \s
                                          ____           _    __   _                                                       \s
                                         |  _ \\    ___  | |  / _| (_)  _ __     ___   _ __                                 \s
                                         | | | |  / _ \\ | | | |_  | | | '_ \\   / _ \\ | '_ \\                                \s
                                         | |_| | |  __/ | | |  _| | | | | | | |  __/ | | | |                               \s
                                         |____/   \\___| |_| |_|   |_| |_| |_|  \\___| |_| |_|         \s
                """);
    }

    public void exit() {
        System.out.println("""
                 ____                                                    _      _           _       _                     \s
                 / ___|  __   __   ____    _ __ ___    _ __ ___     ___  | | __ | |  _   _  | |__   | |__     ___   _ __   \s
                 \\___ \\  \\ \\ / /  / _//\\  | '_ ` _ \\  | '_ ` _ \\   / _ \\ | |/ / | | | | | | | '_ \\  | '_ \\   / _ \\ | '_ \\  \s
                  ___) |  \\ V /  | (//) | | | | | | | | | | | | | |  __/ |   <  | | | |_| | | |_) | | |_) | |  __/ | | | | \s
                 |____/    \\_/    \\//__/  |_| |_| |_| |_| |_| |_|  \\___| |_|\\_\\ |_|  \\__,_| |_.__/  |_.__/   \\___| |_| |_| \s
                                                                                                                           \s
                                          ____           _    __   _                                                       \s
                                         |  _ \\    ___  | |  / _| (_)  _ __     ___   _ __                                 \s
                                         | | | |  / _ \\ | | | |_  | | | '_ \\   / _ \\ | '_ \\                                \s
                                         | |_| | |  __/ | | |  _| | | | | | | |  __/ | | | |                               \s
                                         |____/   \\___| |_| |_|   |_| |_| |_|  \\___| |_| |_|         \s
                """);
        System.exit(0);
    }

    void switchMenu() throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int choice = 50;
        while (choice != 0) {
            printMain();
            choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1 -> save();
                case 2 -> subscription();
                case 3 -> create();
                case 4 -> delete();
                case 5 -> topFive();
                case 6 -> list();
                case 0 -> exit();
                default -> System.out.println("Unknown command");
            }
        }
    }

    public void printMain() {

        System.out.println("""
                                
                Main menu:
                             
                Save         [1] kan bruges
                Subscription [2] kan bruges
                Add          [3] kan bruges
                Delete       [4] kan bruges
                Top Five     [5] kan ikke bruges
                List         [6] kan bruges
                Exit         [0] kan bruges
                """);
    }
    
}
