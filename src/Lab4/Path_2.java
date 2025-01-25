package Lab4;

import java.util.Scanner;

public class Path_2 {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
    }

    private static int[] GetArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Numbers of array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Проверка, отсортирован ли массив
    private static void Exercise1() {
        int[] array = GetArray();
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    // Считывание массива с клавиатуры и вывод
    private static void Exercise2() {
        int[] array = GetArray();
        System.out.print("Result: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Замена первого и последнего элемента массива
    private static void Exercise3() {
        int[] array = GetArray();
        System.out.print("Array 1: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.print("Array 2: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Поиск первого уникального элемента
    private static void Exercise4() {
        int[] array = GetArray();
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("Первое уникальное число: " + array[i]);
                return;
            }
        }
        System.out.println("Уникальных чисел не найдено.");
    }

    // Генерация массива и сортировка методом слияния
    private static void Exercise5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Генерация массива...");
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100); // Случайное число от 0 до 99
        }

        System.out.print("Сгенерированный массив: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        array = SortMerge(array);

        System.out.print("Отсортированный массив: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Сортировка слиянием
    public static int[] SortMerge(int[] array) {
        if (array.length < 2) return array;

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) left[i] = array[i];
        for (int i = mid; i < array.length; i++) right[i - mid] = array[i];

        left = SortMerge(left);
        right = SortMerge(right);

        return Merge(left, right);
    }

    // Слияние двух массивов
    private static int[] Merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];

        return result;
    }
}
