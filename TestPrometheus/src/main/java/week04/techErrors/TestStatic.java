package week04.techErrors;

/**
 * Created by TSV on 13.03.2017.
 */
public class TestStatic {

    public static int a = 100;
    public static int b;

    // was without word static
    // without instance b not 200

    {

        if (a<100) b =200;
    }

    public static void main(String[] args) {
        // TestStatic ts = new TestStatic();
        System.out.println(TestStatic.b);
    }
}
