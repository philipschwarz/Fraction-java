package com.pschwarz.math;

public class Fraction
{
    private int integerValue;

    public Fraction(int integerValue)
    {
        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction that)
    {
        return integerValue > 0 ? this : that;
    }

    public int intValue()
    {
        return integerValue;
    }
}
