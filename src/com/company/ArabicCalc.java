package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArabicCalc extends Calculator {

    @Override
    protected void parse(String expression) {
        String regex = "^([1-9]|10)\\s{0,1}([+-/*])\\s{0,1}([1-9]|10)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);
        if(matcher.find()){
            a = Integer.parseInt(matcher.group(1));
            action = matcher.group(2);
            b = Integer.parseInt(matcher.group(3));
        } else throw new IllegalArgumentException();
    }

    @Override
    protected void printResult(int result) {
        System.out.println(result);

    }
}
