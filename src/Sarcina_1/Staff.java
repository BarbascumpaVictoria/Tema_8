package Sarcina_1;

public class Staff extends Person {
    private String School;
    private double Pay;
 public Staff ( String name, String address, String school, double pay){
     super(name, address);
     this.School = school;
     this.Pay = pay;
 }

public String getSchool(){
    return School;
}
 public void  setSchool(String school){
    }
    public double getPay(){
     return Pay;
    }
public void setPay(double pay){
     this.Pay = pay;
    }

}

