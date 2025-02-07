package es.santander.ascender.ejerc001;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        A a1 = new B();
        A a2 = new C();
        a.mA();
        b.mA();
        a.mB();
        a1.mA();
        a1.mB();
        a2.mB();
        System.out.println(a.numero);
        System.out.println(a1.numero);
        System.out.println(a2.numero);
        
    }
}
