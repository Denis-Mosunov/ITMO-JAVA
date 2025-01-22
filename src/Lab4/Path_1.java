package Lab4;

import java.util.Scanner;

public class Path_1 {
    public static void main(String[] args) {

        Exercise1();
        Exercise2();

        Scanner scanner = new Scanner(System.in);

        // Exercise 3
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        boolean result3 = Exercise3(num1, num2, num3);
        System.out.println("Результат: " + result3);

        // Exercise 4
        System.out.print("Введите первое число: ");
        int num4 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num5 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num6 = scanner.nextInt();
        boolean result4 = Exercise4(num4, num5, num6);
        System.out.println("Результат: " + result4);

        // Exercise 5
        int[] array5 = {3, -3, 7, 4, 5, 4, 3};
        boolean result5 = Exercise5(array5);
        System.out.println("Результат Exercise5: " + result5);

        // Exercise 6
        int[] array6 = {3, -3, 7, 4, 5, 4, 1};
        boolean result6 = Exercise6(array6);
        System.out.println("Результат Exercise6: " + result6);

        scanner.close();
    }

    private static void Exercise1() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
    }

    private static void Exercise2() {
        System.out.print("Делится на 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Делится на 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Делится на 3 и на 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean Exercise3(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }

    private static boolean Exercise4(int num1, int num2, int num3) {
        return num2 > num1 && num3 > num2;
    }

    private static boolean Exercise5(int[] array) {
        if (array.length >= 2) {
            return array[0] == 3 || array[array.length - 1] == 3;
        } else {
            System.out.println("Массив должен содержать минимум два элемента.");
            return false;
        }
    }

    private static boolean Exercise6(int[] array) {
        for (int num : array) {
            if (num == 1 || num == 3) {
                return true;
            }
        }
        return false;
    }
}
