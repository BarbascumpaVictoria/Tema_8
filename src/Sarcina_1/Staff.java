package Sarcina_1;

public class Staff extends Person {
    private String school;
    private double pay;
 public Staff ( String name, String Address, String school, double pay){
     this.school = school;
     this.pay = pay;
 }

public String getSchool(){
}
 public String  setSchool(String school){
    }
    public double getPay(){
    }
public double setPay(double pay2){
     pay = pay2;
     return pay2;
    }
    public String toString(){
     return Person() + " " + school + " " + pay;
    }
}

