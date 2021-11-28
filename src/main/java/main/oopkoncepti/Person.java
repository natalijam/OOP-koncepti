
package main.oopkoncepti;

public class Person {
    
    //Atributi
 
    String name;
    String surname;
    int age;
    
    
    //Konstruktori
    
    public Person(){
    
    }
    
    public Person(int age, String name, String surname){
        this.age = age;
        this.name = name;
        this.surname = surname;    
    }
    
    
    //Metode
    
    public void introduce(){
        System.out.println("Ja sam " + name + " " + surname);
    }
    
    
}
