package lessons.inheritance;

/**
 * Created by TSV on 15.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child =   new Child();

        System.out.println("invoke print");
        parent.print();
        child.print();
        System.out.println("");

        System.out.println("invoke methods for child");
        child.childPrint();;
        child.print();

        System.out.println("create Child inherit from Parent");
        Parent parentChild = new Child();
        System.out.println("invoke method print");
        parentChild.print();

        System.out.println("invoke static method print");

        Parent.staticPrint();
        Child.staticPrint();
        parentChild.staticPrint();



    }
}
