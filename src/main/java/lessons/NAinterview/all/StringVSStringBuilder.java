package lessons.NAinterview.all;

/**
 * Created by userPG on 03.04.2017.
 */
public class StringVSStringBuilder {

    public static void main(String[] args) {
        String string = "hello";
        StringBuilder builder1 = new StringBuilder("hello");
        StringBuilder builder2 = new StringBuilder("hello");

        // разные объекты не будет компилироваться
        //System.out.println(string == builder1);

        // false
        // проверяется instanceof String
        // + метод equals у StringBuilder не переопределен
        System.out.println(string.equals(builder1));

        // false
        // метод equals у StringBuilder не переопределен
        System.out.println(builder1.equals(builder2));
    }

}
