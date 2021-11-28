
package main.oopkoncepti;

// NASLEĐIVANJE PRIMER 2


// klasa B nasleđuje sva svojstva klase A
// klasa A je nadklasa a klasa B je podklasa klase A
public class KlasaB extends KlasaA{
    
    // Atributi
    
    int b;
    
    
    // Konstruktori
    
    public KlasaB(){
        
        //KlasaA ima dva konstruktora, sa super biramo koji hoćemo da pozove u klasaB
        // super(); 
        // ili 
        // super(4);
        //Ako ne odaberemo, važiće default-ni konstruktor
        //Ako nema defaultni prikazaće grešku
        // podklasa ne može menjati konstruktor nadklase
        
        System.out.println("Constructor B");    
    }
    
    
    // Metode
    
    public void methodB(){
        System.out.println("Class B");
    
    }
}
