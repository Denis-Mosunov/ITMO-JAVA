package Lab4;

import java.util.Scanner;

public class Path_1 {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
        Exercise6();
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

    private static void Exercise3() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        boolean result = (num1 + num2 == num3);
        System.out.println("Результат: " + result);
    }


    private static void Exercise4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        boolean result = (num2 > num1 && num3 > num2);
        System.out.println("Результат: " + result);
    }

    private static void Exercise5() {
        int[] array = {3, -3, 7, 4, 5, 4, 3};

        if (array.length >= 2) {
            boolean result = (array[0] == 3 || array[array.length - 1] == 3);
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Массив должен содержать минимум два элемента.");
        }
    }
    private static void Exercise6() {
        int[] array = {3, -3, 7, 4, 5, 4, 1};
        for (int num : array) {
            if (num == 1 || num == 3) {
                System.out.println("Массив содержит число 1 или 3");
                break;}
                else {System.out.println("Массив не содержит число 1 или 3");
                    break;}
            }
        }
    }