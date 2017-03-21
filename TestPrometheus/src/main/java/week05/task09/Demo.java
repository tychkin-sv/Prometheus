package week05.task09;

abstract class Calculator
{
    abstract int sum(int a, int b);
}
 
public class Demo
{
    public static void main(String[] args)
    {
        int result = new Calculator()
        {    
            int sum(int a, int b)
            {
                return a+b;
            }
        }.sum(2, 3);
      System.out.println(result);
    }
}