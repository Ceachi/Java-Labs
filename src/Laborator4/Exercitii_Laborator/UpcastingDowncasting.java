
package Laborator4.Exercitii_Laborator;

/**
 *
 * @author Ceachi Bogdan
 */

class A {
    int x = 3;
    int y = 9;
    
    public void m1() {
        System.out.println("Sunt in clasa A");
    }
    
    public void m1A() {
        System.out.println("Sunt in clasa A");
    }
    public static void metodaStatica1() {
        System.out.println("Apel medoa statica din A");
    }
}

class B extends A {
    int x = 4;
    @Override
    public void m1() {
        System.out.println("Sunt in clasa B");
    }
    
    public void m1B() {
        System.out.println("Sunt in clasa B");
    }
    public static void metodaStatica1() {
        System.out.println("Apel medoa statica din b");
    }
    
}

public class UpcastingDowncasting {
    
    public static void main(String[] args) {
        // Exemplu de Upcasting
        A ref = new B();
        ref.m1(); // apel in B
        ref.m1A(); // apel in A
        //ref.m1B(); // nu are access, pt ca nu e comun suprascris cu A
        ref.metodaStatica1(); // apel metoda statica din A
        
        System.out.println("Trecem la urmatorul exemplu de Downcasting");
        // Exemplu Downcasting este fix procesul invers
        A ref2 = new B();
        B refB = (B) ref2;
        
        refB.m1();
        refB.m1B();
        refB.m1A();
        refB.metodaStatica1(); // aici dupa cum vezi apeleaza static din B
        System.out.println(refB.x);
        System.out.println(refB.y);
        
    }
}
