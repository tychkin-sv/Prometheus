package week04.test10;

class A
{
    void test()
    {
        class B
        {
            // inner classes cannton have static declaration
            //original static void demo(){ }
            void demo(){ }
        }
    }
}