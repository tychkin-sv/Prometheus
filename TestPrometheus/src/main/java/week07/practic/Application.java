package week07.practic;

import java.util.Deque;
import java.util.LinkedList;

class Application{

    public static LinkedList<Double> list;
    final static int NORMAL_SIZE = 2;
    final static double DELTA = 1e-15;
    private static boolean devisionBYZero = false;

    public static double parse (String rpnString) throws RPNParserException, ArithmeticException {

        String[] arr = rpnString.split(" ");
        list = new LinkedList<>();

        for (String s: arr){
           System.out.println(s);
            switch (s) {
                case "+": addValue(list); break;
                case "-": subValue(list); break;
                case "*": mulValue(list); break;
                case "/": divValue(list); break;
                default:
                   try {
                       //Integer i = Integer.parseInt(s);
                       //System.out.println(i);
                       //Double currentValue = i.doubleValue();
                       Double currentValue = Double.parseDouble(s);
                       //System.out.println(currentValue);
                       list.push(currentValue);
                   }
                   catch (NumberFormatException e){
                       throw new RPNParserException();
                   }
            }
        }
        if (list.get(0).isInfinite() || list.get(0).isNaN()) {throw new ArithmeticException();}
        else if (list.size()>1) {throw new RPNParserException();}
        else return list.pop();
	}

    private static void divValue(Deque<Double> list){
    if (list.size()>NORMAL_SIZE - 1) {

          double d1 = list.pop();
          double d2 = list.pop();

          //System.out.println(d1);
          //System.out.println(d2);

          d1 = d2/d1;
          //System.out.println(d1);

          list.push(d1);
        } else throw new RPNParserException();
    }

    private static void mulValue(Deque<Double> list){
        if (list.size()>NORMAL_SIZE - 1) {
            double d1 = list.pop();
            double d2 = list.pop();
            d1 = d2 * d1;
            list.push(d1);
        } else throw new RPNParserException();
    }

    private static void subValue(Deque<Double> list){
        if (list.size()>NORMAL_SIZE - 1) {
            double d1 = list.pop();
            double d2 = list.pop();
            d1 = d2 - d1;
            list.push(d1);
        } else throw new RPNParserException();
    }

    private static void addValue(Deque<Double> list){
        if (list.size()>NORMAL_SIZE - 1) {
            double d1 = list.pop();
            double d2 = list.pop();
            d1 = d2 + d1;
            System.out.println(d1);
            list.push(d1);
        } else throw new RPNParserException();
    }

}