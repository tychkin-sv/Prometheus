package week05.example;

/*The test class*/
// Пример шаблона команда.
public class TestCommand{
   public static void main(String[] args){
       Light l=new Light();
       Command switchUp=new TurnOnLightCommand(l);
       Command switchDown=new TurnOffLightCommand(l);

       Switch s=new Switch(switchUp,switchDown);

       s.flipUp();
       s.flipDown();
   }
}
