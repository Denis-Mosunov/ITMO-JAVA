package Lab2;

public class Main {

    // Методы для суммы
    public int sum(int a, int b) {
        return a + b;
    }

    public long sum(long a, long b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    // Методы для вычитания
    public int subtract(int a, int b) {
        return a - b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // Методы для умножения
    public int multiply(int a, int b) {
        return a * b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // Методы для деления
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо для int!");
        }
        return a / b;
    }

    public long divide(long a, long b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо для long!");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Деление на ноль недопустимо для double!");
        }
        return a / b;
    }

    // TEST
    public static void main(String[] args) {
        Main calculator = new Main();

        // Тестируем методы с int
        System.out.println("Сумма (int): " + calculator.sum(10, 5));
        System.out.println("Вычитание (int): " + calculator.subtract(10, 5));
        System.out.println("Умножение (int): " + calculator.multiply(10, 5));
        System.out.println("Деление (int): " + calculator.divide(10, 5));

        // Тестируем методы с long
        System.out.println("Сумма (long): " + calculator.sum(10000000000L, 5000000000L));
        System.out.println("Вычитание (long): " + calculator.subtract(10000000000L, 5000000000L));
        System.out.println("Умножение (long): " + calculator.multiply(1000000000L, 5L));
        System.out.println("Деление (long): " + calculator.divide(10000000000L, 2L));

        // Тестируем методы с double
        System.out.println("Сумма (double): " + calculator.sum(10.5, 5.2));
        System.out.println("Вычитание (double): " + calculator.subtract(10.5, 5.2));
        System.out.println("Умножение (double): " + calculator.multiply(10.5, 5.2));
        System.out.println("Деление (double): " + calculator.divide(10.5, 5.2));
    }
}
