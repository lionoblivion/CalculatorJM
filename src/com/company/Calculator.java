package com.company;

public abstract class Calculator {

    protected int a;
    protected int b;
    String action;

    private int plus(int x, int y){
        return x+y;
    }
    private int minus(int x, int y){
        return x-y;
    }
    private int div(int x, int y){
            return x / y;
    }
    private int multi(int x, int y){
        return x*y;
    }

    public void execute(String expression){

        parse(expression);

        int result = 0;

        switch (action){
            case "+": result = plus(a,b);
            break;
            case "-": result = minus(a,b);
            break;
            case "/": result = div(a,b);
            break;
            case "*": result = multi(a,b);
            break;
        }
        printResult(result);
    }

    protected abstract void parse(String expression);

    protected abstract void printResult(int result);


}
