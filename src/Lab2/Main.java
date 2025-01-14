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
}
