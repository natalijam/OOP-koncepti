
package main.oopkoncepti;

public class Professor extends Person {
    
    //Atributi
    
    String department;
    String title;
    
    
    //Konstruktori
    
    public Professor(){
    
    }
    
    public Professor(String name, String surname, int age, String department, String title){
        super(age, name, surname);
        this.department = department;
        this.title = title;
        
    }
    
    
    //Metode

    @Override
    public void introduce() {
        System.out.println("Ja sam profesor " + name + " " + surname + " " + title);
    }
    
    
    
    
    
}
