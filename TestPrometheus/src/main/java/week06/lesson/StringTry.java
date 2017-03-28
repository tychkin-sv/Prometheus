package week06.lesson;

/**
 * Created by userPG on 22.03.2017.
 */
public class StringTry {
    public static void main(String[] args) {
        String hello  = "Hello world!!!";
        String hello2 = new String("Hello world!!!");

        // comparing
        System.out.println("! \"" + hello + "\" == \"" + hello2 + "\"      = " + (hello == hello2));
        System.out.println("! \"" + hello + "\".equals(\"" + hello2 + "\") = " + hello.equals(hello2));

        // methods

        //
        String str1="Hello";
        String str2="World";
        String str3=str1+str2;
        String str4="HelloWorld";
        System.out.println(str3==str4);

       String switchString = "abc";

       switch (switchString)
        {
            case "abc":
                System.out.println(switchString);break;

            default: break;

        }
    }
}
