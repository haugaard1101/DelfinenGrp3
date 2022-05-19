package Delfinen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Log {
    private ArrayList<Member> memberList;

    UserInterface ui = new UserInterface(this);

    void run() throws FileNotFoundException {
        ui.start();
        ui.switchMenu();

        ui.exit();


    }

    public Log() {
        memberList = new ArrayList<>();
    }

    public void writeMember(PrintStream out, Member member) {
        out.print(member.getName());
        out.print(";");
        out.print(member.getDateOfBirth());
        out.print(";");
        out.print(member.getId());
        out.print(";");
        out.print(member.getIsPassive());
    }

    public Iterable<Member> getAllMembers(){
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
            String line = in.nextLine();
            //linje scanner
            Scanner lineScanner = new Scanner(line).useDelimiter(";");
            String name = lineScanner.next();
            String id = lineScanner.nextLine();
            String isPassive = lineScanner.nextLine();
            int age = lineScanner.nextInt();
            //LocalDate dateOfBirth = lineScanner.nextLine();
            memberList.add(new Member(name, age, id, isPassive));
        }
        return memberList;


    }


    public void topFive() {

    }


    public void addMember(String name, int age, String isPassive, String id){
        Member member = new Member(name,age,id,isPassive);
        memberList.add(member);

    }


    public boolean removeMember(String id) {
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

}
