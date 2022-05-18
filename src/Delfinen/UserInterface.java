package Delfinen;

import java.util.Scanner;

public class UserInterface {

    private Scanner in = new Scanner(System.in);
    private String decision;
    private int decisionNumb;
    private Log application;

    public UserInterface (Log application){
        this.application=application;
    }
    public void delete(){
        getDecision();
        String id= in.nextLine();
        boolean del=application.remove(id);

    }

    public void create (){
        System.out.print("create new member:" );
        System.out.println("name: ");
        String name = getDecision();
        System.out.print("age: ");
        int age= getDecisionNumb();
        in.nextLine();
        System.out.print("is passive: ");
        String isPassive =getDecision();
        System.out.print("id: ");
        String id=getDecision();
        application.addMember1(name, age,isPassive,id);
    }
    public UserInterface() {
    }

    public String getDecision() {
        decision = in.nextLine();
        return decision;
    }

    public int getDecisionNumb() {
        decisionNumb = in.nextInt();
        return decisionNumb;
    }


    void start() {
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

    void exit() {
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

    void invalidAnswer() {
        System.out.println("\nyou entered an invalid answer!\n");
    }

    public void nameText() {
        System.out.print("Enter your name: ");
    }

    public void emailText() {
        System.out.print("Enter your email: ");
    }

    public void phoneNumberText() {
        System.out.print("Enter your phone number: ");
    }

    public void addressText() {
        System.out.print("Enter your address");
    }

    public void dateOfBirthText() {
        System.out.print("Enter your date of birth  (yyyy/mm/dd) : ");
    }

    public void paymentInfoText() {
        System.out.print("Enter your payment info: ");
    }

    public void typeOfMemberText() {
        System.out.print("Enter your type of member: ");
    }

    private void haveBennCompSwimText() {
        System.out.print("Enter if your have been Comp Swim: ");
    }

    void printMain() {

        System.out.println("""
                                
                Main menu:
                             
                Save         [1] kan bruges
                Load         [2] kan ikke bruges
                Subscription [3] kan ikke bruges
                Top Five     [4] kan ikke bruges
                Add          [5] kan bruges
                Remove       [6] kan ikke bruges
                Display      [7] kan bruges
                Exit         [0] kan bruges
                """);
    }
}
