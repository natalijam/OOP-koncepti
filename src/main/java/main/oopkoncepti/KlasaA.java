
package main.oopkoncepti;

// NASLEĐIVANJE PRIMER 1

public class KlasaA {
    
    //Atributi
    
    int a;
    
    
    // Konstruktori
    
    public KlasaA(){
        System.out.println("Constructor A");
    }
    
    public KlasaA(int a){
        this.a = a;
        System.out.println("Constructor A sa parametrom");           
    }
    
    
    //Metode
    
    public void methodA(){
        System.out.println("Class A");
    
    }
    
}
