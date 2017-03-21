package week04.test1_05;

enum Demo
{
    DEMO;
     
    int i = 10;
     
    // decrise 1  i =9
    {
        i--;
    }
    // decrise 1  i =8
    {
        --i;
    }
     //                  insert 8 (after i=7)   insert i = 6 (before 7-1)
    private Demo()
    {
        i = i--                 + --i;
    }
}
 
public class TestClass
{
    public static void main(String[] args)
    {
        System.out.println(Demo.DEMO.i);
    }
}