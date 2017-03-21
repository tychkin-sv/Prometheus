package week05.task10;

interface Iface1
{
    String a = "A";
    String methodA();
}
 
interface Iface2 extends Iface1
{
    String b = "B";
    String methodB();
}
 
class Demo implements Iface1, Iface2
{
    public String methodA()
    {
        return a+b;
    }
     
    public String methodB()
    {
        return b+a;
    }
}
 
public class Main
{
    public static void main(String[] args)
    {
        Demo demo = new Demo();
        System.out.println(demo.methodA());
        System.out.println(demo.methodB());
    }
}