package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Calculator calculator = new ArabicCalc();
        try{
            calculator.execute(input);
        } catch(IllegalArgumentException e){
            calculator = new RomanCalc();
            calculator.execute(input);
        }
    }
}
