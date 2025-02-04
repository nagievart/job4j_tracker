package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperations() {
        return Calculator.sum(10) + Calculator.minus(10) + this.divide(10);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        int resultOfMinus = Calculator.minus(10);
        System.out.println(resultOfMinus);
        Calculator calculatorOfDivide = new Calculator();
        int resultOfDivide = calculatorOfDivide.divide(10);
        System.out.println(resultOfDivide);
        Calculator calculatorOfAllOperations = new Calculator();
        int resultOfAllOperationsSum = calculatorOfAllOperations.sumAllOperations();
        System.out.println(resultOfAllOperationsSum);
    }
}