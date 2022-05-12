package Delfinen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Log {

    private ArrayList<Member> memberList=new ArrayList<>();



    public void calcPayment() {


    }

    public void saveMembers() throws FileNotFoundException {
        PrintStream ps=new PrintStream("Memberfile.txt");
        for (Member member:memberList){
            ps.println(member);

        }
    }

    public void loadMembers() throws FileNotFoundException {
        memberList.clear();
        Scanner in =new Scanner(new File("Memberfile.txt"));
        Member members=new Member;

        Member member=(String) ;

        while (in.hasNextLine()){
            member=in.next();
            memberList.add(member);
        }
    }
    public void topFive() {

    }
    public void addMember(){

    }





}
