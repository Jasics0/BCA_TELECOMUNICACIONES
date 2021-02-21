/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bca_telecomunicaciones;

import java.math.BigInteger;
public class Fibonacci
{
    static BigInteger fib(long n)
    {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE; 
        BigInteger c = BigInteger.ZERO;
        if (BigInteger.valueOf(n).equals(0))
            return BigInteger.ZERO;
        for (int i = 2; i <= n; i++)
        {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
 
    public static void main (String args[])
    {
        long n = 100000;
        System.out.println(fib(n));
    }
}