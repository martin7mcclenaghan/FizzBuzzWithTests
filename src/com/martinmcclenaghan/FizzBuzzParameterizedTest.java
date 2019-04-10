package com.martinmcclenaghan;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class FizzBuzzParameterizedTest {

    private int number;
    private String response;
    private FizzBuzz tester = new FizzBuzz();

    public FizzBuzzParameterizedTest(int number, String response) {
        this.number = number;
        this.response = response;
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions() {
        return Arrays.asList(new Object[][]{

                {30, "FizzBuzz"},
                {100, "Buzz"},
                {23, ""},
                {95, "Buzz"},
                {21, "Fizz"}


        });


    }

    @org.junit.Test
    public void FizzBuzz () {
    assertEquals(tester.FizzbuzzMethod(number),response);
    }


}
