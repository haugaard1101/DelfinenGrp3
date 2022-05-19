package Delfinen;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Member {
    private String name;
    private String email;
    private int phoneNumber;
    private String address;
    private String paymentInfo;
    private String typeOfMember;
    private boolean haveBeenCompSwim;
    private boolean isPassive;
    private String id;
    private LocalDate dateOfBirth;
    private int age;


/*
    Member(String name, int age, String email, int phoneNumber, String address, LocalDate dateOfBirth, String paymentInfo,
           String typeOfMember, boolean haveBeenCS, boolean isPassive, String id) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.paymentInfo = paymentInfo;
        this.typeOfMember = typeOfMember;
        this.haveBeenCompSwim = haveBeenCS;
        this.isPassive = isPassive;
        this.id = id;
    }

 */

    /*
    public Member(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Member(String name) {

    }

     */

    public Member(String name, int age, String id, boolean isPassive) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isPassive = isPassive;

    }
    public Member(String name, int age, String id, boolean isPassive, LocalDate dateOfBirth) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isPassive = isPassive;
        this.dateOfBirth = dateOfBirth;

    }
    public Member(String name, int age, String id, boolean isPassive, String dateOfBirth) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isPassive = isPassive;
        this.dateOfBirth = dateOfBirth;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public String getTypeOfMember() {
        return typeOfMember;
    }

    public boolean getHaveBeenCompSwim() {
        return haveBeenCompSwim;
    }

    public boolean getIsPassive() {
        return isPassive;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public int calcAge() {
        LocalDate now = LocalDate.now();
        //LocalDate date = LocalDate.of(2004, 5, 19);
        Period period = Period.between(dateOfBirth, now);
       // return (int)ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
        return period.getYears();
        //hvordan skal det skrives ind om det er fra scanner
    }

    @Override
    public String toString() {
        return
                 name + " " + isPassive + " age " + age + " id "+ id;
    }


}
