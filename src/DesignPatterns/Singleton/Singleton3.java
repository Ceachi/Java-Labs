
package DesignPatterns.Singleton;

/**
 In acest document am prezentat Design Patternul Singleton
 * Singleton1 :  bun dar ineficient
 * Singleton2 : mai eficient, dar nu e bun pt multithreading
 * Singleton3 : eficient pentru multithreading
 * 
 * Un exemplu clar de singleton este : enum
 * @author Ceachi Bogdan
 */
public class Singleton3 {
    public static void main(String args[]) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc3 obj = Abc3.getInstance();
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc3 obj = Abc3.getInstance();
            }  
        });
        
        t1.start();
        t2.start();
        
    }
}

/**
 * Solutia: daca nu punem la metoda getInstance synchronized
 * o sa apeleze constructorul de 2 ori
 * @author Ceachi Bogdan
 */
class Abc3 {
    private static Abc3 obj;
    
    private Abc3() {
        System.out.println("Apel construcor");
    }
    public static synchronized Abc3 getInstance() {
        if(obj == null) {
            obj = new Abc3();
        }
        
        return obj;
    }
}
