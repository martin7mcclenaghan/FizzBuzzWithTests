package com.martinmcclenaghan;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class FizzBuzzParameterizedTest {

    @Parameterized.Parameters
    public static Collection <Object> testConditions () {
        return Arrays.asList(new Object[][] {




        });


    }

    @org.junit.Test
    public void main () {

    }


}
