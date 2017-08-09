package lessons.clock;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by userPG on 05.04.2017.
 */
public class ClockAngelTest {

    @Test
    public void getAngelThan00_00() throws Exception {
        ClockAngel ca = new ClockAngel(0,0);
        ca.clockCalculate();
        System.out.println(ca.toString());
        Assert.assertEquals("0:0", ca.toString());
    }

    @Test
    public void getAngelThan06_00() throws Exception {
        ClockAngel ca = new ClockAngel(0,6);
        ca.clockCalculate();
        System.out.println(ca.toString());
        Assert.assertEquals("0:180", ca.toString() );
    }

    @Test
    public void getAngelThan06_30() throws Exception {
        ClockAngel ca = new ClockAngel(30,6);
        ca.clockCalculate();
        System.out.println(ca.toString());
        Assert.assertEquals("180:195", ca.toString());
    }

    @Test
    public void getAngelThan12_00() throws Exception {
        ClockAngel ca = new ClockAngel(0,12);
        ca.clockCalculate();
        System.out.println(ca.toString());
        Assert.assertEquals("0:0", ca.toString());
    }

    @Test
    public void getAngelThan15_00() throws Exception {
        ClockAngel ca = new ClockAngel(0,15);
        ca.clockCalculate();
        System.out.println(ca.toString());
        Assert.assertEquals("0:90", ca.toString());
    }

    @Test
    public void getAngelThan24_00() throws Exception {
        ClockAngel ca = new ClockAngel(0,24);
        ca.clockCalculate();
        System.out.println(ca.toString());
        Assert.assertEquals("0:0", ca.toString());
    }
}