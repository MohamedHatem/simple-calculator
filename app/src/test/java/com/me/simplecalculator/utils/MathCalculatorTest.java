package com.me.simplecalculator.utils;

import com.me.simplecalculator.Utils.MathCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MathCalculatorTest {

    @Test
    public void addition_isCorrect() {
        assertEquals((Double) 4.0, MathCalculator.add(2.0d, 2.0d));
    }

    @Test
    public void subtraction_isCorrect() {
        assertEquals((Double) 2.0, MathCalculator.sub(4.0d, 2.0d));
    }

    @Test
    public void multiplication_isCorrect() {
        assertEquals((Double) 6.0, MathCalculator.mult(3.0d, 2.0d));
    }

    @Test
    public void division_isCorrect() {
        assertEquals((Double) 1.0, MathCalculator.div(2.0d, 2.0d));
    }
}