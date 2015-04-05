package com.pschwarz.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest
{
    @Test
    public void oneAndOne() throws Exception
    {
        assertEquals(1, gcd(1, 1));
    }

    private int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        else
        {
            return gcd( b, a % b);
        }
    }
}
