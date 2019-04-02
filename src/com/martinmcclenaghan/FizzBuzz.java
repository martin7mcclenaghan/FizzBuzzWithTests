package com.martinmcclenaghan;

public class FizzBuzz {

    public String FizzbuzzMethod(int n) {

        String s = "";
        if (n % 3 == 0 && n % 5 == 0) {
            s = "FizzBuzz";
        } else if (n % 5 == 0) {
            s = "Buzz";
        } else if (n % 3 == 0) {
            s = "Fizz";
        }


        return s;
}
}
