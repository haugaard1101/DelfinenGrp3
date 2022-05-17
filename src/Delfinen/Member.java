package Delfinen;

public class Member {
    private int age;
    private String name;
    private String email;
    private int phoneNumber;
    private String address;
    private int dateOfBirth;
    private String paymentInfo;
    private String typeOfMember;
    private boolean haveBeenCompSwim;
    private boolean isPassive;
    private int id;


    Member(String name, int age, String email, int phoneNumber, String address, int dateOfBirth, String paymentInfo,
           String typeOfMember, boolean haveBeenCS, boolean isPassive,int id) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.paymentInfo = paymentInfo;
        this.typeOfMember = typeOfMember;
        this.haveBeenCompSwim = haveBeenCS;
        this.isPassive = isPassive;
        this.id=id;
    }

    public Member(String name, int age) {
        this.name=name;
        this.age=age;
    }


    public int getAge() {
        return age;
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

    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public int getId(){return id;}

}
