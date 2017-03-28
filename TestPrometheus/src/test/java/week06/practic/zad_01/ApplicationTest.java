package week06.practic.zad_01;

import org.junit.Test;

import java.io.OutputStream;

import static org.junit.Assert.*;

/**
 * Created by userPG on 27.03.2017.
 */
public class ApplicationTest {

    @Test
    public void testMain1()  {
        //System.out.println("main");
        String[] args = null;
        Application.main(args);
    }

    @Test
    public void testMain2()  {
        //System.out.println("main");
        String[] args = {"0Hh3o0"};
        Application.main(args);
        assertTrue(true);

    }




}