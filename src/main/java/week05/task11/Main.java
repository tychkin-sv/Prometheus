package week05.task11;

class Demo
{
    void test(String s){
        System.out.println("String");
    }

    void test(Integer i){
        System.out.println("Integer");
    }
}
 
public class Main
{
    public static void main(String[] args)
    {
        Demo demo = new Demo();
        //demo.test(null);
        demo.test((String) null);
    }
}
