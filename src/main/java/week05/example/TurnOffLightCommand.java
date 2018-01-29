package week05.example;
/*the Command for turning off the light*/
public class TurnOffLightCommand implements Command{
   private Light theLight;

   public TurnOffLightCommand(Light light){
        this.theLight=light;
       }

   public void execute(){
      theLight.turnOff();
   }
}
