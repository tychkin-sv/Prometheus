package week04.test1_02;

enum Seasons
{
    SPRING, WINTER, AUTUMN, SUMMER;
     
    // Calls number of enum sequence
    private Seasons()
    {
        System.out.println("ok");
    }
}
 
public class Test
{
    public static void main(String[] args)
    {
        Seasons seasons;
        seasons = Seasons.SUMMER;
       // System.out.println(seasons.ordinal());  // number in enum sequence, begin from 0
       // System.out.println(seasons.toString()); // string representation of item
    }
}