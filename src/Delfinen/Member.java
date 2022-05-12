package Delfinen;

public class Member {
    private int age;
    private String name;
    private String email;
    private int phoneNumber;
    private String adress;
    private int dateOfBirth;
    private String paymentInfo;
    private String typeOfMember;
   private boolean haveBeenCS;

    Member(int age, String name, String email, int phoneNumber, String adress, int dateOfBirth, String paymentInfo,
           String typeOfMember, boolean haveBeenCS) {
        this.age = age;
        this.name=name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress=adress;
        this.dateOfBirth=dateOfBirth;
        this.paymentInfo=paymentInfo;
        this.typeOfMember=typeOfMember;
        this.haveBeenCS=haveBeenCS;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public String getAdress(){
        return adress;
    }
    public String getPaymentInfo(){
        return paymentInfo;
    }
    public String getTypeOfMember(){
        return typeOfMember;
    }
    public boolean getHaveBeenCS(){
        return haveBeenCS;
    }

}
