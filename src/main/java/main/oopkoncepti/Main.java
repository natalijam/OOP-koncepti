
package main.oopkoncepti;


public class Main {

    public static void main(String[] args) {
        
        
    //NASLEĐIVANJE   (KlasaA, KlasaB, KlasaC)
    
        KlasaA a = new KlasaA();
        KlasaB b = new KlasaB();
        
        a.methodA();
        
        b.methodA();
        b.methodB();
        
        // KlasaB nasleđuje sve metode od KlasaA, pa samim tim objekat klase B
        // može pozvati metodu od klasaA
        
        KlasaC c = new KlasaC();
        
        c.methodC();
        c.methodA();
        c.methodB();
        
        // KlasaC je nastavak od KlasaB, pa nasleđuje sve od nje, ali i od KlasaA
        // Nasleđivanje mora biti 1x1
        // Objekat c pozvao methodB i ispisuje override-ovanu verziju
        // Jedna metoda pozvana od strane dva objekta se drugačije ponaša
        
        //Nasleđivanje KONSTRUKTORA
        
        //KlasaA objekat - poziva konstruktor KlasaA
        //KlasaB objeakt - poziva kontruktor KlasaA, pa onda konstruktor KlasaB
        //KlasaC objekat - poziva konstruktor KlasaA, pa KlasaB, pa onda KlasaC
        
        KlasaA a2 = new KlasaA(9);
        // napravili smo novi konstruktor sa parametrom
        // novi objekat poziva konstruktor sa parametrom
        
        
       
       
    }
    
}
