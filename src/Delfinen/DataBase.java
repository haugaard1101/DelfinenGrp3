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
        out.println();
    }

    public Iterable<Member> getAllMembers() {
        return memberList;
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
            String name = lineScanner.next();
            String dateOfBirth = lineScanner.next();
            boolean isPassive = lineScanner.nextBoolean();
            memberList.add(new Member(id, name, dateOfBirth, isPassive));
        }
        return memberList;


    }

    public int calcTotalPayment() {
        int total = 0;
        for (Member member : memberList) {
           total += member.calcPayment();
        }
        return total;
    }


    public void topFive() {

    }


    public void addMember(String name, String dateOfBirth, boolean isPassive) {
        int id = memberList.size() + 1;
        Member member = new Member(id, name, dateOfBirth, isPassive);
        memberList.add(member);
    }


    public boolean passiveFailSafe() {
        boolean state = true;
        while (keepGoing) {
            String passiveState = ui.getDecision();
            if (passiveState.equals("false")) {
               state = false;
               keepGoing = false;
            } else if (passiveState.equals("true")){
                keepGoing = false;
            }else{
                System.out.println("Typo (true or false)");
            }
        }
        return state;
    }

    public String nameFailSafe() {
        String trueName = "";
        while (keepGoing) {
            String typedName = ui.getDecision();
            for (int i = 0; i < typedName.length(); i++) {
                if (typedName.charAt(i) < 'a' || typedName.charAt(i) > 'z') {
                    System.out.println("Contains illegal character. Try again.");
                } else {
                    keepGoing = false;
                    typedName = trueName;
                }

            }

        }
        return trueName;
    }



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
