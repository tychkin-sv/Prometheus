package lessons.NAinterview.constructors;

/**
 * Created by userPG on 03.04.2017.
 */
public class Application {

    // самый низкий приоритет
    static public void action(byte ... args) {
        System.out.println("byte ... args");
    }

    // самый !высокий приоритет расширение до большего
    static public void action(long l1, short s2) {
        System.out.println("long l1, short s2");
    }

    // средний приоритет boxing
    static public void action(Byte b1, Byte b2) {
        System.out.println("byte b1, byte b2");
    }

    public static void main(String[] args) {
        byte b=1;
        Application.action(b,b);

    }
}
