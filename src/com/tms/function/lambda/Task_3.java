package com.tms.function.lambda;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        LogicFunc<String> logic1 = (str) -> new StringBuilder(str).reverse().toString();

        LogicFunc<Integer> logic2 = (n) ->{
            int factorialResult = 1;
            for (int i = 1; i <= n; i++){
                factorialResult *= i;
            }
            return  factorialResult;
        };
        logicRealization(logic1, logic2);
    }

        private static void logicRealization(LogicFunc<String> logic1, LogicFunc<Integer> logic2) {
        System.out.println("Введите номер опции (1 или 2)");
        Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println(logic1.chosenLogicOperation("Java"));
            }
            if (choice == 2) {
                System.out.println("Факториал заданного числа: " + logic2.chosenLogicOperation(4));
            }
            scanner.close();
    }
}

