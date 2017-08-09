package lessons.NAinterview.all;

/**
 * Created by userPG on 03.04.2017.
 */
public class LongTry {

    public static void main(String[] args) {
        Long l1 = new Long(111L);
        Long l2 = 111L;
        Long l3 = 222L;
        Long l4 = 222L;
        System.out.println(l1 == l2);
        System.out.println(l3 == l4);

        Long.valueOf(l1);


    }

}
