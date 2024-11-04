package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Рекурсивний підхід: " + FibonacciExamples.fibonacciRecursive(n));
        System.out.println("Ітераційний підхід: " + FibonacciExamples.fibonacciIterative(n));
        System.out.println("Динамічне програмування: " + FibonacciExamples.fibonacciDP(n));
    }
}