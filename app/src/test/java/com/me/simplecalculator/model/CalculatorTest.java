package com.me.simplecalculator.model;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorTest {

    Calculator model;

    @Before
    public void setUp() throws Exception {
        model = new Calculator();
    }


    @Test
    public void addition_isCorrect() {
        model.enterNewDigit("2");
        model.enterTheOperation("+");
        model.enterNewDigit("2");
        model.calcTheResult();
        assertEquals("4.0", model.getResult());
    }

    @Test
    public void subtraction_isCorrect() {
        model.enterNewDigit("2");
        model.enterTheOperation("-");
        model.enterNewDigit("2");
        model.calcTheResult();
        assertEquals("0.0", model.getResult());
    }

    @Test
    public void multiplication_isCorrect() {
        model.enterNewDigit("2");
        model.enterTheOperation("*");
        model.enterNewDigit("2");
        model.calcTheResult();
        assertEquals("4.0", model.getResult());
    }

    @Test
    public void division_isCorrect() {
        model.enterNewDigit("2");
        model.enterTheOperation("/");
        model.enterNewDigit("2");
        model.calcTheResult();
        assertEquals("1.0", model.getResult());
    }


}