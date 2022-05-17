package Delfinen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Log {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Member> memberList = new ArrayList<>();

    UserInterface ui = new UserInterface();

    public void calcPayment() {


    }

    public void saveMembers() throws FileNotFoundException {

        PrintStream ps = new PrintStream("Memberfile.txt");
        for (Member member : memberList) {
            ps.println(member);

        }
    }


    public ArrayList<Member> loadMembers() throws FileNotFoundException {
        ArrayList<Member>member = new ArrayList<>();
        Scanner in = new Scanner(new File("Memberfile.csv"));
        while (in.hasNextLine()) {
            String line = in.nextLine();
            //linje scanner
            Scanner lineScanner = new Scanner(line).useDelimiter(";");
            String name = lineScanner.next();
            int age = lineScanner.nextInt();
            memberList.add(new Member(name, age));
        }
        return memberList;



        }





    public void topFive() {

    }

    public void addMember() {
        ui.ageText();
        Scanner in = new Scanner(System.in);
        String name = "nothing";
        int age = 0;
        while (!name.isBlank() && in.hasNextLine()) {
            name = in.nextLine();
            if (!name.isBlank()) {
                memberList.add(new Member(name, age));

            }
        }
    }
    public void removeMember(){
        ui.ageText();
        Scanner in = new Scanner(System.in);
        String name = "nothing";

        while (!name.isBlank() && in.hasNextLine()) {
            name = in.nextLine();
            if (!name.isBlank()) {
               // memberList.remove(); skal laves om til id list. !!

            }
        }
    }

    public void displayMember() {
        for (Member member : memberList) {
            System.out.println(member);
        }
        String isAre = "are";
        String s = "s";
        if (memberList.size() == 1) {
            isAre = "is";
            s = "";
        }
        System.out.println(isAre + " " + memberList.size() + s);
    }


}
