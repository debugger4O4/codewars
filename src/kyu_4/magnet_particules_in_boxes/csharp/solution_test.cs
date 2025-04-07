using System;
using NUnit.Framework;

[TestFixture]
public static class MagnetsTests
{
    private static Random rnd = new Random();
    private static void assertFuzzyEquals(double act, double exp)
    {
        bool inrange = Math.Abs(act - exp) <= 1e-6;
        if (!inrange)
        {
            string specifier = "#0.000000";
            Console.WriteLine(
                "At 1e-6: Expected must be " + exp.ToString(specifier) +", but got " + act.ToString(specifier));
        }
        Assert.That(inrange, Is.True);
    }

    [Test, Order(1), Description("Fixed Tests: Doubles")]
    public static void test1()
    {
        assertFuzzyEquals(Magnets.Doubles(1, 10), 0.5580321939764581);
        assertFuzzyEquals(Magnets.Doubles(10, 1000), 0.6921486500921933);
        assertFuzzyEquals(Magnets.Doubles(10, 10000), 0.6930471674194457);
        assertFuzzyEquals(Magnets.Doubles(20, 10000), 0.6930471955575918);
    }
}