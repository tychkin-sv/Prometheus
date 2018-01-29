package week04.test1_03;

enum Seasons
{
    SPRING, WINTER;
     
    private Seasons()
    {
        System.out.println("ok");
    }
}
 
public class Test
{
    public static void main(String[] args)
    { 
       Seasons[] seasons= new Seasons[2];
  
       for (int i = 0; i  < seasons.length; i++)
       {
           System.out.print(seasons[i]);
       }
   }
}