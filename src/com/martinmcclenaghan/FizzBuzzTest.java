package com.martinmcclenaghan;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz tester = new FizzBuzz();

    @org.junit.Test
    public void Fizzbuzz() {

        assertEquals(tester.FizzbuzzMethod(30), "FizzBuzz");
        assertEquals(tester.FizzbuzzMethod(100), "Buzz");
        assertEquals(tester.FizzbuzzMethod(23), "");
        assertEquals(tester.FizzbuzzMethod(95), "Buzz");
        assertEquals(tester.FizzbuzzMethod(21), "Fizz");

    }
}