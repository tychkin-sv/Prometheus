package week06.practic.zad_01;

import java.io.OutputStream;

/**
 * Created by userPG on 22.03.2017.
 */
public class Application {


    public static void main(String[] args) {
        //System.out.println(args.length);

        if (args != null &&  args.length == 1 && args[0]!="") {

            StringBuilder in = new StringBuilder(args[0]);
            StringBuilder out = new StringBuilder();

            //System.out.println(in);
            //System.out.println(in.length());
            int index = 0;
            do {
                String res = "" + in.charAt(index);
                int repeats = index;
                while (repeats<(in.length() - 1) &&
                       in.charAt(index) == in.charAt(repeats+1) &&
                        (repeats-index)<8){
                    repeats = repeats + 1;
                    //System.out.println("Символ с позиции i = " + index + " повтор в позиции j = " + repeats);
                }
                out.append(res);
                if (index!=repeats) out.append(repeats-index+1);
                index = repeats+1;


            } while (index<in.length());
            System.out.println(out);
            }


    }

    }




