
package main.oopkoncepti;


public class Student2 implements Cloneable {
    
    //Atributi
    
    String name;
    String surname;
    int StudentId;
    
    
    //Konstruktori
    
    public Student2(){
    }
    
    public Student2(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.StudentId = id;
    }
    
    
    //Metode

    
    // toString metoda
    @Override
    public String toString() {
        return name + " " + surname;
    }
    
    
    // hashCode metoda

    @Override
    public int hashCode() {
        return super.hashCode(); 
    // kako hashCode vraća jedinstveni broj objekta, ova metoda se može override-ovati, 
    // ali bi isto trebalo sa nekim jedinstvenim brojem
    // na primer
    // return studentId;
    }

    
    // equals(Object obj) metoda
    
    
    
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);}
    
    
    // ovu metodu takođe možemo override-ovati
    // moramo da napravimo logiku
    // npr. da proverava da li su dva ID-a ista ako jesu vraća true

//    @Override
//    public boolean equals(Object obj) {
//        
//        Student2 tempStudent = (Student2) obj;
//        
//        if(tempStudent == null){
//            return false;
//        }
//        else if(this.StudentId == tempStudent.studentId){
//            return true;
//        }
//        else {
//            return false;
//        }
//    // proverava da li su dva ID-a ista ako jesu vraća true
//        }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    }
    
    
    
    
    
    
    
    
    
