package com.rchfullstack;
public class Exercise3 {
    public void exerciseThreeNumbers() {
        performOperation(45, 11, "+");
        performOperation(12, 4, "*");
        performOperation(24, 6, "/");
        performOperation(55, 12, "-");
    }
    private void performOperation(int num1, int num2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2!=0) {
                    result = num1 / num2;
                    break;
                }
                break;
            default:
                System.out.println("Invalid operator: " + operator);
        }
        System.out.printf("%d %s %d = %d%n", num1, operator, num2, result);
    }
}