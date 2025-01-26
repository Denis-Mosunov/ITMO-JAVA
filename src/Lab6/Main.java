package Lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Пример работы с абстрактными классами
        Person client = new Client("Иван", "Иванов", "Сбербанк");
        client.printInfo();

        Person worker = new BankWorker("Анна", "Смирнова", "Тинькофф");
        worker.printInfo();

        // Пример работы с интерфейсами
        BankOperations clientOp = new ClientWithOperation("Олег", "Петров", "ВТБ");
        clientOp.performOperation();

        BankOperations workerOp = new BankWorkerWithOperation("Екатерина", "Сидорова", "Альфа-Банк");
        workerOp.performOperation();

        // Пример работы с грузовиком
        Truck truck = new Truck(8000, "MAN", 'B', 90.0f, 6, 20000);
        truck.outPut();
        truck.newWheels(8);

        // Пример работы с наследованием
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();
        child.number = 42;
        child.printNumber();

        // Пример работы с методом получения данных
        SubClass subClass = new SubClass();
        String name = subClass.getName();
        int age = subClass.getAge();
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

// Абстрактный класс Человек
abstract class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void printInfo();
}

// Класс Клиент
class Client extends Person {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Клиент: " + firstName + " " + lastName + ", Банк: " + bankName);
    }
}

// Класс Работник банка
class BankWorker extends Person {
    private String bankName;

    public BankWorker(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Работник банка: " + firstName + " " + lastName + ", Банк: " + bankName);
    }
}

// Интерфейс для операций
interface BankOperations {
    void performOperation();
}

// Реализация интерфейсов
class ClientWithOperation extends Client implements BankOperations {
    public ClientWithOperation(String firstName, String lastName, String bankName) {
        super(firstName, lastName, bankName);
    }

    @Override
    public void performOperation() {
        System.out.println("Клиент выполняет банковскую операцию.");
    }
}

class BankWorkerWithOperation extends BankWorker implements BankOperations {
    public BankWorkerWithOperation(String firstName, String lastName, String bankName) {
        super(firstName, lastName, bankName);
    }

    @Override
    public void performOperation() {
        System.out.println("Работник банка выполняет банковскую операцию.");
    }
}

// Главный класс Автомобиль
class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car(int weight, String model, char color, float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Car() {}
}

// Класс Грузовик
class Truck extends Car {
    private int numberOfWheels;
    private int maxWeight;

    public Truck(int weight, String model, char color, float speed, int numberOfWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        System.out.println("Новое количество колес: " + this.numberOfWheels);
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес: " + numberOfWheels + ", Максимальный вес: " + maxWeight + " кг.");
    }
}

// Главный класс с вводом данных
class MainClass {
    protected Scanner scanner = new Scanner(System.in);

    public int getAge() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }
}

// Класс-наследник с переопределением метода
class SubClass extends MainClass {
    public String getName() {
        System.out.print("Введите ваше имя: ");
        return scanner.next();
    }
}
class ParentClass {
    protected int number;
}

class ChildClass extends ParentClass {
    public void printNumber() {
        System.out.println("Число из главного класса: " + number);
    }
}
