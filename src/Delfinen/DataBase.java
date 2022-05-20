package Delfinen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class DataBase {
    private ArrayList<Member> memberList;

    private boolean keepGoing = true;

    UserInterface ui = new UserInterface(this);


    void run() throws FileNotFoundException {
        ui.start();
        ui.switchMenu();
    }

    public DataBase() {
        memberList = new ArrayList<>();
    }

    public void writeMember(PrintStream out, Member member) {
        out.print(member.getId());
        out.print(";");
        out.print(member.getName());
        out.print(";");
        out.print(member.getDateOfBirth());
        out.print(";");
        out.print(member.getIsPassive());
    }

    public Iterable<Member> getAllMembers() {
        return memberList;
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
        Scanner in = new Scanner(new File("MemberFile.csv"));
        while (in.hasNextLine()) {
            String line = in.nextLine(); //linje scanner
            Scanner lineScanner = new Scanner(line).useDelimiter(";");
            int id = lineScanner.nextInt();
            //in.next(); //Scanner bug
            String name = lineScanner.next();
            String dateOfBirth = lineScanner.next();
            boolean isPassive = lineScanner.nextBoolean();
            memberList.add(new Member(id, name, dateOfBirth, isPassive));
        }
        return memberList;


    }


    public void topFive() {

    }


    public void addMember(String name, String dateOfBirth, boolean isPassive) {
        int id = memberList.size() + 1;
        Member member = new Member(id, name, dateOfBirth, isPassive);
        memberList.add(member);
    }

/*
    public int nameFailSafe() {
        while (keepGoing) {
            String name = ui.getDecision();
            if (name) {
                keepGoing = false;
            } else {
                System.out.println("Enter a number under 9999.");
                System.out.print("id: ");
            }
        }
        return 0;
    }

 */



    private Member findMemberById(int id) {
        for (Member member : memberList) {
            if (member.getId() == id) {
                return member;
            }

        }
        return null;
    }

    public boolean removeMember(int id) {
        Member member = findMemberById(id);
        if (member == null) {
            return false;
        } else {
            memberList.remove(member);
            return true;
        }

    }

}
