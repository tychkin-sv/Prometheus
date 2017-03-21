package week05.lesson.lesson01;

/**
 * Created by TSV on 15.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Demo child = new Demo();

        parent.print();
        child.demoPrint();
        child.print();

        Parent parentChild = new Demo();
        parentChild.print();

        parentChild.staticPrint();
        Parent.staticPrint();
        Demo.staticPrint();




    }
}
