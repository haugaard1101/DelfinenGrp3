package Delfinen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Log {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Member> memberList;
    private Member member1;

    public Log(Member member1) {
        this.member1 = member1;
    }

    UserInterface ui = new UserInterface();

    public Log() {
        memberList = new ArrayList<>();
    }

    public void writeMember(PrintStream out, Member member) {
        out.print(member.getName());
        out.print(";");
    }


    public void calcPayment() {


    }

    public void saveMembers() throws FileNotFoundException {

        PrintStream out = new PrintStream("MemberFile.csv");
        for (Member member : memberList) {
            writeMember(out, member);

        }
    }


    public ArrayList<Member> loadMembers() throws FileNotFoundException {
        ArrayList<Member> member = new ArrayList<>();
        Scanner in = new Scanner(new File("MemberFile.csv"));
        while (in.hasNextLine()) {
            String line = in.nextLine();
            //linje scanner
            Scanner lineScanner = new Scanner(line).useDelimiter(";");
            String name = lineScanner.next();
            int age = lineScanner.nextInt();
            int id = lineScanner.nextInt();
            boolean isPassive = lineScanner.nextBoolean();
            //LocalDate dateOfBirth = lineScanner.nextLine();
           // memberList.add(new Member(name, age, id, isPassive));
        }
        return memberList;


    }


    public void topFive() {

    }


    public void addMember1(String name, int age,String isPassive, String id){
        Member member = new Member(name,age,id,isPassive);
        memberList.add(member);

    }

   /* public void removeMember() {
        /// lave id
        Scanner in = new Scanner(System.in);
        String name = "nothing";

        while (!name.isBlank() && in.hasNextLine()) {
            name = in.nextLine();
            if (!name.isBlank()) {
                // memberList.remove(); skal laves om til id list. !!

            }
        }
    }
    */


    public boolean remove(String id) {
        Member member = findMemberById(id);
        if (member == null) {
            return false;
        } else {
            memberList.remove(member);
            return true;
        }

    }

    private Member findMemberById(String id) {
        for (Member member : memberList) {
            if (member.getId().equalsIgnoreCase(id)) {
                return member;
            }

        }
        return null;
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
