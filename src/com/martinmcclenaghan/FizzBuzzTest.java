package com.martinmcclenaghan;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @org.junit.Test
    public void Fizzbuzz() {
        FizzBuzz tester = new FizzBuzz();

        assertEquals(tester.FizzbuzzMethod(30),"FizzBuzz");
        assertEquals(tester.FizzbuzzMethod(100),"Buzz");
        assertEquals(tester.FizzbuzzMethod(23),"");
        assertEquals(tester.FizzbuzzMethod(95),"Buzz");
        assertEquals(tester.FizzbuzzMethod(21),"Fizz");


    }
}