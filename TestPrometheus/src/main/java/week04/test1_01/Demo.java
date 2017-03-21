package week04.test1_01;

enum D
{
    A, B, C;

    private D()
    {
        System.out.print("*");
    }
}


public class Demo
{
    public static void main(String[] args)
    {
        Enum enu = D.B;
    }
}
