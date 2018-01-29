package week05.test04;

interface A
{
    void test();
}
 
class B implements A
{
    public final void test()
    {
        System.out.println("Ok");
    }
}
