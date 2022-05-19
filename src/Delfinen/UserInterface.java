package Delfinen;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInterface {



    private Scanner in = new Scanner(System.in);
    private String decision;
    private int decisionNumb;
    private final DataBase application;
    private boolean decisionBoolean;

    public void save() throws FileNotFoundException {
        application.saveMembers();
    }

    public void load() throws FileNotFoundException {
        application.loadMembers();
    }

    public void sub(){
        application.calcPayment();
    }

    public void topFive(){
        application.topFive();
    }
/*
    public void display(){
        application.displayMember();
    }

 */

    public void list(){
        for (Member member : application.getAllMembers()){
            System.out.println(member);        }
    }

    /*
    public void delete(){
        System.out.print("Enter Id of member you want to delete: ");
        String id = in.nextLine();
        boolean del = application.removeMember(id);
        if (del) {
            System.out.println("The member wiht Id " + id + " has been deleted");
        } else {
            System.out.println("The member with Id " + id + " dose not exist");
        }

    }

     */

    public void create (Member member){
        System.out.println("create new member:" );
        System.out.print("id: ");
        application.idFailSafe();
        in.nextLine(); //Scanner bug
        System.out.print("name: ");
        String name = getDecision();
        System.out.print("Date of birth: ");
        String dateOfBirth = getDecision();
        member.calcAge(); // problem
        System.out.print("are you passive: ");
        boolean isPassive = getDecisionBoolean();
        application.addMember(application.idFailSafe(), dateOfBirth, name, isPassive);

        list();
    }
    public UserInterface(DataBase application) {
        this.application = application;
    }

    public String getDecision() {
        decision = in.nextLine();
        return decision;
    }

    public boolean getDecisionBoolean(){
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
            switch (choice) {
                case 1 -> save();
                case 2 -> load();
                case 3 -> sub();
                case 4 -> topFive();
                case 5 -> create();
                //case 6 -> delete();
                case 7 -> list();
                case 0 -> exit();
                default -> System.out.println("unknown command");
            }
        }
    }


    public void printMain() {

        System.out.println("""
                                
                Main menu:
                             
                Save         [1] kan bruges
                Load         [2] kan ikke bruges
                Subscription [3] kan ikke bruges
                Top Five     [4] kan ikke bruges
                Add          [5] kan bruges
                Delete       [6] kan bruges
                List         [7] kan bruges
                Exit         [0] kan bruges
                """);
    }
}
