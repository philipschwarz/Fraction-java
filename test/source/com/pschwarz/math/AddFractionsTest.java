package com.pschwarz.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest
{
    @Test
    public void zeroPlusZero() throws Exception
    {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }
}
