package week07.test04;

import java.util.Objects;

class A extends Exception {}
class B extends A {}

public class Main {
public static void main(String args[]) {
try {
        throw new B();
    }
    catch(B a)     {
        System.out.print("A"); 
    }
    catch(A b) {
        System.out.print("B");
    }
catch(Throwable b) {
    System.out.print("B");
}
}
} 