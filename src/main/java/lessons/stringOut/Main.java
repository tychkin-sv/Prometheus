package lessons.stringOut;

/**
 * Created by TSV on 20.03.2017.
 */
public class Main  {

    public static void main(String[] args) {
     /*   System.out.println(1 + 1);
        System.out.println(1 + 1 + "");
        System.out.println(1 + "" + 1 );
        System.out.println("" + 1 + 1 );
        System.out.println("Не забывайте, что 1/2   = " + 1/2);
        System.out.println("Не забывайте, что 1.0/2 = " + 1.0/2);
*/
        String str1="Hello";
        String str2="World";
        String str3=str1+str2;
        String str4="HelloWorld";
        String str5=str1.concat(str2);
        System.out.println(str3==str4);
        System.out.println(str5);
    }
}
