package Sarcina_1;

public class Student extends Person{
    private String Program;
    private int Year;
    private double Fee;
   public  Student( String name, String address, String program, int year, double fee){
       super(name, address);
       this.Program = program;
    this.Year = year;
    this.Fee = fee;
   }
    public String getProgram(){
        return Program;
    }

    public void setProgram(){
    }
    public int getYear(){
       return Year;
    }
    public void setYear(){
    }
    public double getFee(){
       return Fee;
    }
    public void setFee(double fee){
       this.Fee = fee;
    }

}
