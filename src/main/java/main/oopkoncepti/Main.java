
package main.oopkoncepti;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        
    //NASLEĐIVANJE   (KlasaA, KlasaB, KlasaC)
//    
//        KlasaA a = new KlasaA();
//        KlasaB b = new KlasaB();
//        
//        a.methodA();
//        
//        b.methodA();
//        b.methodB();
//        
//        // KlasaB nasleđuje sve metode od KlasaA, pa samim tim objekat klase B
//        // može pozvati metodu od klasaA
//        
//        KlasaC c = new KlasaC();
//        
//        c.methodC();
//        c.methodA();
//        c.methodB();
//        
//        // KlasaC je nastavak od KlasaB, pa nasleđuje sve od nje, ali i od KlasaA
//        // Nasleđivanje mora biti 1x1
//        // Objekat c pozvao methodB i ispisuje override-ovanu verziju
//        // Jedna metoda pozvana od strane dva objekta se drugačije ponaša
//        
//        //Nasleđivanje KONSTRUKTORA
//        
//        //KlasaA objekat - poziva konstruktor KlasaA
//        //KlasaB objeakt - poziva kontruktor KlasaA, pa onda konstruktor KlasaB
//        //KlasaC objekat - poziva konstruktor KlasaA, pa KlasaB, pa onda KlasaC
//        
//        KlasaA a2 = new KlasaA(9);
//        // napravili smo novi konstruktor sa parametrom
//        // novi objekat poziva konstruktor sa parametrom



    // NASLEĐIVANJE PRIMER 2 (Klase Person, Java, Professor)

//        Student s1 = new Student("Marko", "Markovic", 23, "marko.markovic@cubes.rs", 10, "Programiranje");
//        
//        s1.introduce();
//        
//        Professor p1 = new Professor("Petar", "Petrovic", 54, "Fizika", "doktor nauka");
//        
//        p1.introduce();
    


    // OBJECT KLASA PRIMER  (Klasa Student2)
    
    Student2 s1 = new Student2("Marko", "Markovic", 4747);
    Student2 s2 = new Student2("Petar", "Petrovic", 988);
    
    // toString() metoda nad objektom
    System.out.println(s1.toString());
    // s1.toString() ili samo s1
    // štampa Student2@65ae6ba4
    // naziv klase
    // heksadecimalni format - hash code tog objekta (nije adresa objekta)
    
    // hashCode() metoda nad objektom
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    // svaki objekat ima svoj hashcode, ova metoda ih štampa
    
    // equals(Object obj) metoda nad objektom
    System.out.println(s1.equals(s2));
    // upoređuje da li su isti objekti u pitanju
    // po default-u nisu dva objekta jedan, vraća false
    // overrite smo uradili da poredimo ID-eve, ako s1 ima isti Id kao s2 onda je true
    
    // getClass() metoda nad objektom
    System.out.println(s1.getClass());
    // prikazuje kojoj klasi objekat pripada
    
    
    // protected Object clone() metoda 
    s1 = (Student2) s2.clone(); //castovanje + add exeption -throws CloneNotSupportedException
    
    System.out.println(s1);
   
    
    
    
    }
    
}
