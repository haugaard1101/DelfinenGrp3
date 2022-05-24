package Delfinen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class DataBase {

    private final ArrayList<Member> memberList;
    UserInterface ui = new UserInterface(this);

    //TODO competitionSwimmer har højeste prioritet for hvad der skal laves samt topFive

    void run() throws FileNotFoundException {
        ui.start();
        ui.load();
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
        out.print(";");
        out.print(member.getDisciplin());
        out.print(";");
        out.print(member.getTrainingResult());
        out.print(";");
        out.print(member.getDateOfTraining());
        out.println();

    }

    public Iterable<Member> getAllMembers() { //TODO skal spørge om hvad "Iterable" er.
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
            String disciplin=lineScanner.next();
            String trainingResult=lineScanner.next();
            String dateOfTraining=lineScanner.next();
            memberList.add(new Member(id, name, dateOfBirth, isPassive, disciplin, trainingResult, dateOfTraining));
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

    public void topFive() { //TODO har højeste prioritet for hvad der skal laves

    }

    public void addMember(String name, String dateOfBirth, boolean isPassive, String disciplin, String trainingResult, String dateOfTraining) {
        int id = memberList.size() + 1;
        Member member = new Member(id, name, dateOfBirth, isPassive, disciplin, trainingResult, dateOfTraining);
        memberList.add(member);
    }

    public boolean competitionSwimmerFailSafe() {
        boolean isCompSwim = false;
        boolean keepGoing = true;
        String answer = ui.getDecision();
        while (keepGoing) {
            if (answer.equals("yes")) {
                isCompSwim = true;
                keepGoing = false;

            } else if (answer.equals("no")) {
                keepGoing = false;
            } else
                System.out.println("Typo (yes/no) ");
        }
        return isCompSwim;

    }

    public boolean passiveActiveChange() { //TODO skal kunne skifte mellem aktiv og passiv
        String change = ui.getDecision();

        // memberList;
        //TODO

        return false;
    }

    public boolean passiveFailSafe() {
        boolean state = true;
        boolean keepGoing = true;
        while (keepGoing) {
            String passiveState = ui.getDecision();
            if (passiveState.equals("false")) {
                state = false;
                keepGoing = false;
            } else if (passiveState.equals("true")) {
                keepGoing = false;
            } else {
                System.out.println("Typo (true or false)");
            }
        }
        return state;
    }

    public String nameFailSafe() {
        boolean keepGoing = true;
        String typedName = "";
        while (keepGoing) {
            typedName = ui.getDecision();
            //System.out.println(typedName);
            boolean keep = true;
            for (int i = 0; i < typedName.length(); i++) {
                System.out.println(typedName.charAt(i));
                if (!(typedName.charAt(i) >= 'a' && typedName.charAt(i) <= 'z')) // TODO JESSICA !!! kig på ascii tabel.
                // && && typedName.charAt(i) == ' '
                //typedName.charAt(i) >= 'A' && typedName.charAt(i) <= 'Z' && typedName.charAt(i) == ' ')
                {

                    System.out.println("Contains illegal character. Try again.");

                    //TODO Skal nok også have typedName.charAt(i) < 'A' || typedName.charAt(i) > 'Z' && typedName.charAt(i) > ' '
                } else {
                    keep = false;
                }
            }
            if (!keep) {
                keepGoing = false;
            }
        }
        return typedName;
    }

    public String dateOfBirthFailSafe() {
        boolean keepGoing = true;
        String typedDateOfBirth = "";
        while (keepGoing) {
            typedDateOfBirth = ui.getDecision();
            boolean keep = true;
            if (typedDateOfBirth.length() == 10) {
                for (int i = 0; i < typedDateOfBirth.length(); i++) {
                    if ((typedDateOfBirth.charAt(i) >= '0' && typedDateOfBirth.charAt(i) <= '9' && typedDateOfBirth.charAt(i) == '-')) {
                        System.out.println("Contains illegal character. Try again.");
                    } else {
                        keep = false;
                    }
                    if (!keep) {
                        keepGoing = false;
                    }
                }
            } else if (typedDateOfBirth.length() > 10) {
                System.out.println("Contains more than 10 characters. Try again.");
            } else {
                System.out.println("Contains less than 10 characters. Try again.");

            }

        }
        return typedDateOfBirth;
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
