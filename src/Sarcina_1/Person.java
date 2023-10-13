package Sarcina_1;

public class Person {
    private String name;
    private String Address;
    public Person(String name, String Address){
        this.name = name;
        this.Address = Address;

    }
    public String toString(){
        return name + "  " + Address;
    }
}
//    public String getName(){
//        return name;
//    }
//    public String getAddress(){
//        return Address;
//    }
//
//    public String setAddress(String Address){
//        this.Address = Address;
//        return Address;
//    }

