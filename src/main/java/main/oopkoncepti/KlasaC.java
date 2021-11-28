
package main.oopkoncepti;

public class KlasaC extends KlasaB {
    
    //Atributi
    
    int c;
    
    
    //Konstruktori
    
    public KlasaC(){
        System.out.println("Constructor C");    
    }
    
    
    //Metode
    
    public void methodC(){
        System.out.println("Class C");
    }
    
    // Menjamo metodu od KlasaB u okviru klase C:

    @Override  //anotacija koja govori da je reč o override-u
    public void methodB() {
       // super.methodB(); 
       //kljucna rec super pristupamo nadklasi - pozvana methodB
       
       // pristupanje varijabli iz KlasaC
       // this.c = 15;
       
       // pristupanje varijabli iz KlasaB
       // super.b = 10;
       
       System.out.println("Class B - override");
    }
    
    // Ovaj override je samo za objekat od KlasaC, objekat od KlasaB i dalje ima 
    // inicijalnu metodu i vrednost atributa
     
    
    
    
    
}
