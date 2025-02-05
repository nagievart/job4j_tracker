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

    public int sumAllOperations(int z) {
        return Calculator.sum(z) + Calculator.minus(z) + this.divide(z);
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
        int resultOfAllOperationsSum = calculatorOfAllOperations.sumAllOperations(10);
        System.out.println(resultOfAllOperationsSum);
    }
}