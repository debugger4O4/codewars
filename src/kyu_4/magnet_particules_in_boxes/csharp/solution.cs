using System;

public class Magnets
{
    public static double Doubles(int maxk, int maxn)
    {
        double sum = 0.0;
        for (int k = 1; k <= maxk; k++)
        {
            for (int n = 1; n <= maxn; n++)
            {
                sum += 1 / (k * Math.Pow(n + 1, 2 * k));
            }
        }
        return sum;
    }
}