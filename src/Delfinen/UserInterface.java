package Delfinen;

import java.util.Scanner;

public class UserInterface {

    private Scanner in =new Scanner(System.in);
    private String decision;
    private int decisionNumb;

    public String getDecision (){
        decision=in.nextLine();
        return decision;
    }
    public int getDecisionNumb(){
        decisionNumb=in.nextInt();
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
                             
                Save         [1]
                Load         [2]
                Subscription [3]
                Top Five     [4]
                Add          [5]
                Remove       [6]
                Display      [7]
                Exit         [0]
                """);
    }
}
