package Delfinen;

public class CompititionSvimmer extends Member {
    private String disciplin;
    private String trainingResult;
    private int dateOfTraining;

     CompititionSvimmer(int age, String name, String email, int phoneNumber, String address, int dateOfBirth, String paymentInfo,
                        String typeOfMember, boolean haveBeenCS, boolean isPassive, String disciplin,
                        String trainingResult,int dateOfTraining){
         super(name,age, email,phoneNumber,address,dateOfBirth,paymentInfo,typeOfMember, haveBeenCS, isPassive);
         this.disciplin=disciplin;
         this.trainingResult=trainingResult;
         this.dateOfTraining=dateOfTraining;

    }
    public String getDisciplin() {
         return disciplin;
    }
    public String getTrainingResult(){
         return trainingResult;
    }
    public int getDateOfTraining(){
         return dateOfTraining;
    }
}
