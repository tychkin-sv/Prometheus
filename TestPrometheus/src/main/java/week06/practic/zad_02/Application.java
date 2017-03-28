package week06.practic.zad_02;

/**
 * Created by userPG on 22.03.2017.
 */
public class Application {

    public static void main(String[] args) {

        if (args != null &&  args.length == 1 && args[0]!="") {
            StringBuilder in = new StringBuilder(args[0]);
            StringBuilder out = new StringBuilder();
            Boolean correct = true;
            int index=0;
            char previousChar, currentChar;
            currentChar = previousChar = in.charAt(index);
            //System.out.println("in =  " + in);
            // first char is digit
            if (Character.isDigit(currentChar)) correct = false;
             else out.append(currentChar);

             for (index=1; index<in.length(); index ++){
                currentChar = in.charAt(index);
                //System.out.println("step " + index + " " + currentChar);
                if (Character.isDigit(currentChar) && Character.isDigit(previousChar))
                    correct = false;
                if (currentChar==previousChar) correct = false;
                if (!correct) break;
                if (!Character.isDigit(previousChar) && Character.isDigit(currentChar))
                {
                   int repeats = Integer.parseInt("" + currentChar);
                   // System.out.println("repeats = " + repeats);
                   for (int i = 1; i<repeats; i++) {
                       out.append(previousChar);
                     //  System.out.println("repeats " + i);
                   }
                } else {
                    out.append(currentChar);
                   // System.out.println("out " + out);
                }
                // System.out.println(index + " out " + out);
                previousChar = currentChar;
            }
            // if in is correct string
            if (correct) System.out.println(out);
            //else System.out.println("Error");
        }
    }
}
