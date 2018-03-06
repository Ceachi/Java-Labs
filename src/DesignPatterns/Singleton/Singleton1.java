package DesignPatterns.Singleton;

/**
 *In acest document am prezentat Design Patternul Singleton
 * Singleton1 :  bun dar ineficient
 * Singleton2 : mai eficient, dar nu e bun pt multithreading
 * Singleton3 : eficient pentru multithreading
 * 
 * Un exemplu clar de singleton este : enum
 * @author Ceachi Bogdan
 */
public class Singleton1 {
    
    public static void main(String args []) {
        Abc a = Abc.getInstance();
        Abc b = Abc.getInstance();
    }
}
/**
 * Se observa ca o data facuta o instanta, se apeleaza 1 singura data constructorul.
 * o problema de remarcat, este faptul ca, obiectul deja se creeaza la compilare.
 * pentru o mica, dar nu finala imbunatatire, trb observat Singleton2
 * @author Ceachi Bogdan
 */
class Abc {
    private static Abc obj = new Abc(); // static pt ca se creeaza de JVM la creearea clasei
    
    private Abc() {
        System.out.println("instance created");
    }
    public static Abc getInstance() {
        return obj;
    }
}
