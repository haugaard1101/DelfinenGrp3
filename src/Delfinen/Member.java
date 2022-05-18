package Delfinen;

import java.time.LocalDate;
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
    private int id;
    private LocalDate dateOfBirth;


    Member(String name, int age, String email, int phoneNumber, String address, LocalDate dateOfBirth, String paymentInfo,
           String typeOfMember, boolean haveBeenCS, boolean isPassive, int id) {
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

    public Member(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
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
        LocalDate date = LocalDate.of(2004, 5, 19);
        System.out.println();
        return (int)ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
        //hvordan skal det skrives ind om det er fra scanner
    }
}
