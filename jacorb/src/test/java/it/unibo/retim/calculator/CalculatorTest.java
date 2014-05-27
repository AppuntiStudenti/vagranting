package it.unibo.retim.calculator;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
    private NaiveCalculator calculator;

    @Before
    public void setUp()
    {
        calculator = new NaiveCalculator();
    }

    @Test
    public void twoPlusTwoIsFour()
    {
        Assert.assertEquals(4, calculator.sum(2,2));
    }

    @Test
    public void twoPlusThreeIsFive()
    {
        Assert.assertEquals(5, calculator.sum(2,3));
    }
}