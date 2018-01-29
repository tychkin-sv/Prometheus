package week04.test09;

class OuterClass
{
    static class InnerClass
    {
        int i;
    }
}
public class My{
    public static void main(String[] args) {
        System.out.println( new OuterClass.InnerClass().i);
    }

}