package week07.test03;

/**
 * Created by userPG on 29.03.2017.
 */
public class Main {
    public static int test(){
        try {
            return 1;
        } catch (RuntimeException re){
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(Main.test());
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println("i1 == i2 = " + (i1 == i2));

        Integer num1 = 50;
        Integer num2 = num1;
        num1++;
        num1--;
        System.out.println("num1==num2 = " + (num1==num2));

        // Не равно, т.к. проверяется класс
        System.out.println("Integer.valueOf(1).equals(Long.valueOf(1L)) = " + Integer.valueOf(1).equals(Long.valueOf(1L)));
        System.out.println("Integer.valueOf(1) = " + Integer.valueOf(1));
        System.out.println("Long.valueOf(1L) = " + Long.valueOf(1L));

        System.out.println("1 == 1L = " + (1 == 1L));



        try
        {
            int x = 0;
            int y = 5 / x;
        }
        catch (ArithmeticException ae)
        {
            System.out.print("Arithmetic Exception ");
        }
        catch (Exception e)
        {
            System.out.print("Exception ");
        }

        System.out.print("Done");
    }
}
