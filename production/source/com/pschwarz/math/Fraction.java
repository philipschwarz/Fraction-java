package com.pschwarz.math;

public class Fraction
{
    private final int numerator;
    private final int denominator;

    public Fraction(int addend)
    {
        this(addend, 1);
    }

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that)
    {
        return new Fraction(this.numerator + that.numerator, denominator);
    }

    @Override
    public String toString()
    {
        return String.format("%d/%d", numerator, denominator);
    }

    @Override
    public boolean equals(Object other)
    {
        if (other instanceof Fraction) {
            Fraction that = (Fraction)other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
        }
        return false;
    }
}
