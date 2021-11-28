
package main.oopkoncepti;

public class Student extends Person {
    
    //Atributi
    
    String email;
    int studentId;
    String section; //odnosi se na smer koji student pohađa
    
    
    //Konstruktori
    
    public Student(){
    
    }
    
    public Student(String name, String surname, int age, String email, int studentId, String section){
        super(age, name, surname);
        this.email = email;
        this.studentId = studentId;
        this.section = section;    
    }
    
    
    
    //Metode    
    
    @Override
    public void introduce(){
        System.out.println("Ja sam student " + name + " " + surname);    
    }
    
    
    
    
}
