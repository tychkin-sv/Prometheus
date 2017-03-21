package lessons.methods;

/**
 * Created by TSV on 20.03.2017.
 */
abstract class AbstractParent {
  int MAX_VAL = 20;
}
interface iAbstractParent{
    int iMAX_VAL = 20;
}


public class AbstractTry extends  AbstractParent implements iAbstractParent{
    public void setMAX_VAL(int val){
        this.MAX_VAL = val;
    }
    public int getMAX_VAL(){
        return this.MAX_VAL;
    }
    public void setIMAX_VAL(int val){
        // cannot change value for final variable
        // this.iMAX_VAL = val;
        return;
    }
    public int getIMAX_VAL(){
        return this.iMAX_VAL;
    }

    public static void main(String[] args) {
        AbstractTry at = new AbstractTry();
        at.setMAX_VAL(30);
        System.out.println(at.getMAX_VAL());
    }
}
