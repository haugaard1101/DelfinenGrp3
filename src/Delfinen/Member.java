package Delfinen;

import java.time.LocalDate;
import java.time.Period;

public class Member {
    private String name;
    private String email;
    private int phoneNumber;
    private String address;
    private String paymentInfo;
    private String typeOfMember;
    private boolean haveBeenCompSwim;
    private boolean isPassive;
    private int id;
    private LocalDate dateOfBirth;
    private int age;

/*
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

 */
    public Member(int id, String name, String dateOfBirth,boolean isPassive) {
        this.name = name;
        this.id = id;
        this.isPassive = isPassive;
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

    public int getId() {
        return id;
    }

    public int calcAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(dateOfBirth, now);
        return period.getYears();

    }

    @Override
    public String toString() {
        return
                 id + " :ID " + name + " :Name " + dateOfBirth + " :Date of birth ";
    }


}
