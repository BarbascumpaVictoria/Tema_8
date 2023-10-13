package Sarcina_1;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;
   public  Student( String name, String Address, String program, int year, double fee){
       this.program = program;
    this.year = year;
    this.fee = fee;
   }
    public String getProgram(){
        return null;
    }

    public String setProgram(){
    }
    public int getYear(){
    }
    public int setYear(){
    }
    public double getFee(){
    }
    public double setFee(double fee){
       this.fee = fee;
       return fee;
    }
    public String toString(){
       return Person() + " " + program + " " + year + "  " + fee;
    }
}
