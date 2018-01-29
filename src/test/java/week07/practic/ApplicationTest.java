package week07.practic;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by userPG on 30.03.2017.
 */
public class ApplicationTest {
    // Точность
    Double delta = 1e-15;

    // тестировани нормальных значений
    @Test
    public void parse1() throws Exception {
       // assertEquals(2100.0, Application.parse("10 20 + 30 40 + *") ,  delta);
        // деление на ноль вещественных значений не дает Exception
        double d = 0.0/0.0;
        assertTrue(Double.isInfinite(d) || Double.isNaN(d));
        System.out.println(d);
    }

    @Test
    public void parse2() throws Exception {
        assertEquals(40.0 , Application.parse("12 2 3 4 * 10 5 / + * +"), delta);
    }

    @Test
    public void parse3() throws Exception {
        assertEquals(10, Application.parse("1 2 + 3 + 4 +") ,  delta);
    }

    @Test
    public void parse4() throws Exception {
        assertEquals(11, Application.parse("1 2 + 3 + 5 +") ,  delta);
    }

    // тестировани исключений
    // RPNParserException
    @Test(expected = RPNParserException.class)
    public void testParseRPNParserException1() {
        Application.parse("10 20 30 () +");
    }

    @Test(expected = RPNParserException.class)
    public void testParseRPNParserException2() {
        Application.parse("10 20 Е * +");
    }

    @Test(expected = RPNParserException.class)
    public void testParseRPNParserException3() {
        Application.parse("10 E +");
    }

    @Test(expected = RPNParserException.class)
    public void testParseRPNParserException4() {
        Application.parse("10 20 30 40 * +");
    }

    // тестировани исключений
    @Rule
    public ExpectedException exc = ExpectedException.none();

    // ArithmeticException
    @Test//(expected = ArithmeticException.class)
    public void testParseArithmeticException1() {
        exc.expect(ArithmeticException.class);
       // int i = 0/0;
        Application.parse("10 0 /");
    }

    @Test(expected = ArithmeticException.class)
    public void testParseArithmeticException2() {
        Application.parse("2 1 0 / +");
    }

    @Test(expected = ArithmeticException.class)
    public void testParseArithmeticException3() {
        Application.parse("NaN NaN /");
    }

    @Test(expected = ArithmeticException.class)

    public void testParseArithmeticException4() {

    Application.parse("10 NaN 6 7 + - *");
    }
}