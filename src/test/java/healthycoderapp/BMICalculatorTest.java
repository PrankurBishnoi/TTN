package healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void shouldThrowException(){

        Executable exec = ()->BMICalculator.isDietRecommended(70,0);
        assertThrows(ArithmeticException.class,exec);
    }

}