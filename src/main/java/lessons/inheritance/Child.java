package lessons.inheritance;

/**
 * Created by TSV on 15.03.2017.
 */
public class Child extends Parent {
    private int childField = 11;
    private int inheritField = super.inheritField;

    public void childPrint(){
        System.out.println("Child print void childPrint");
    }

    public void print() {
        System.out.println("Child print");
    }

    public static void staticPrint(){
        System.out.println("Child static print");
    }

}
