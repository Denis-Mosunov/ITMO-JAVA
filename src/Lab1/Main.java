package Lab1;

public class Main {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
        Exercise6();
    }

    private static void Exercise1() {

        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }

    private static void Exercise2() {
        int result1 = (46 + 10) * (10 / 3);
        int result2 = 29 * 4 * (-15);
        System.out.println("Результат первого выражения: " + result1);
        System.out.println("Результат второго выражения: " + result2);
    }

    private static void Exercise3() {
        int number = 10500;
        int result3 = (number / 10) / 10;
        System.out.println("Результат выражения с переменной number: " + result3);
    }

    private static void Exercise4() {
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result4 = a * b * c;
        System.out.println("Произведение чисел: " + result4);
    }

    private static void Exercise5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);
        System.out.println("Число 3: " + num3);
    }

    private static void Exercise6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Упражнение 6. Введите число: ");
        int b = scanner.nextInt();
        if (b % 2 == 0) {
            if (b > 100) System.out.println("Выход за пределы диапазона");
            else System.out.println("Вы ввели четное число");
        } else System.out.println("Вы ввели нечетное число");
    }
}