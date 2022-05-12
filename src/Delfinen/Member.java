package Delfinen;

public abstract class Member {
    private int age;
    private String name;
    private String email;
    private int phoneNumber;
    private String adress;
    private int dateOfBirth;
    private String paymentInfo;
    private String typeOfMember;
   private boolean haveBeenCompSwim;
   private boolean isPassive;

    Member(int age, String name, String email, int phoneNumber, String adress, int dateOfBirth, String paymentInfo,
           String typeOfMember, boolean haveBeenCS, boolean isPassive) {
        this.age = age;
        this.name=name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress=adress;
        this.dateOfBirth=dateOfBirth;
        this.paymentInfo=paymentInfo;
        this.typeOfMember=typeOfMember;
        this.haveBeenCompSwim =haveBeenCS;
        this.isPassive = isPassive;
    }

    public Member() {

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
    public boolean getHaveBeenCompSwim(){
        return haveBeenCompSwim;
    }
    public boolean getIsPassive() {
        return isPassive;
    }
    public int getDateOfBirth(){
        return dateOfBirth;
    }

}
