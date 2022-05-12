package Delfinen;

public class CompititionSvimmer extends Member {
    private String disciplin;
    private String trainingResult;
    private int dateOfTraining;

     CompititionSvimmer(String disciplin, String trainingResult,int dateOfTraining){
         super();
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
