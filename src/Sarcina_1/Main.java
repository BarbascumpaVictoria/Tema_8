package Sarcina_1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ana", "Codru");
        Staff staff = new Staff( "Ana", "Codru", "Nr.56", 2350);
       Student student = new Student("Ana", "Codru", "Cibernetica",2006, 5500 );
        System.out.println(person.getAddress() +"  "+ person.getName());
        System.out.println(person.getAddress() +"  "+ person.getName() + " "+ staff.getPay()+ "  "+staff.getSchool());
        System.out.println(person.getAddress() +"  "+ person.getName() + " "+ student.getFee()+"  "+student.getYear() +"  " +student.getFee());
    }
    }

//Sarcina 1.	Implementați ierarhia de clase descrisă în imaginea de mai jos:
//        ______PICTURE
//
// Creați o clasă cu metoda main. În interiorul metodei main instanțiați un obiect de tipul clasei
// Person, Student și Staff. Afișați la consolă aceste obiecte utilizând instrucțiunea System.out.println, de ex.:
// Student someStudent = new Student(...);
// System.out.println(someStudent);
// Asigurați-vă că rezultatul obținut la consolă coincide cu mesajul descris în imagine.
// *** Semnul - (minus) din fața atributelor claselor indică necesitatea utilizării modificatorului de acces private,
// pe când semnul + (plus) indică modificatorul public.
