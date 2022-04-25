package Calculator;

import org.junit.*;
public class CalculatorTest {
    private Calculator calculator;
    private static final double delta = 1e-15;
    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testSquareRoot(){
        double num = 101;
        double expected_result = Math.sqrt(num);
        calculator.square_root(num);
        double result = calculator.get_ans();
        Assert.assertEquals(expected_result, result, 0.00001);
    }

    @Test
    public void power(){
        double base = 4;
        double power = 3;
        double expected_result = 64;
        calculator.power(base,power);
        double result = calculator.get_ans();
        Assert.assertEquals(expected_result, result, 0.00001);
    }
    
    
    @Test
    public void loge(){
        double num = 2.7;
        double expected_result = Math.log(num);
        calculator.loge(num);
        double result = calculator.get_ans();
        Assert.assertEquals(expected_result, result, 0.00001);
    }
    
    @Test
    public void testfactorial(){
        double num = 4;
        double expected_result = 24;
        calculator.factorial(num);
        double result = calculator.get_ans();
        Assert.assertEquals(expected_result, result, 0.00001);
    }





}
