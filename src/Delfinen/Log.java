package Delfinen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Log {
Scanner scanner = new Scanner(System.in);
    private ArrayList<Member> memberList = new ArrayList<>();
    private ArrayList<Member> passiveMembers = new ArrayList<>();

    public void calcPayment() {


    }

    public void saveMembers() throws FileNotFoundException {

        PrintStream ps = new PrintStream("Memberfile.txt");
        for (Member member : memberList) {
            ps.println(member);

        }
    }
    public void savePassiveMembers() throws FileNotFoundException {
        PrintStream ps = new PrintStream("PassiveMemberfile.txt");
        for (Member member : passiveMembers) {
            ps.println(member);

        }
    }
/*
    public void loadMembers() throws FileNotFoundException {
        memberList.clear();
        Scanner in = new Scanner(new File("Memberfile.txt"));
        Member members = new Member;

        Member member = (String);

        while (in.hasNextLine()) {
            member = in.next();
            memberList.add(member);
        }
    }

 */

    public void topFive() {

    }

    public void addMember() {


    }

    public void displayMember(){
        for(Member member: memberList){
            System.out.println(member);
        }
        String isAre = "are";
        String s = "s";
        if(memberList.size() == 1){
            isAre = "is";
            s = "";
        }
        System.out.println(isAre + " " + memberList.size() + s);
    }


}
