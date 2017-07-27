package org.sasha;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator=new Calculator();
    @Before
    public void setup(){
        System.out.println("Сколько тестов, столько и этих записей");
    }
    @Test
    public void sum () {
        assertEquals(7, calculator.sum(4, 3));
    }
       @Test(expected = NullPointerException.class)
        public void divide(){
            assertEquals(10,calculator.divide(null,4),0.0d);
    }
}
