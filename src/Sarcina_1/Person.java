package Sarcina_1;

public class Person {
    private String Name;
    private String Address;
    public Person(String name, String address){
        this.Name = name;
        this.Address = address;

    }
    public String toString(){
        return Name + "  " + Address;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }

    public void setAddress(String Address){
    }
}

