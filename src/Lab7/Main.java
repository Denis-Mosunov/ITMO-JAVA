package Lab7;

class Airplane {
    // Вложенный класс Крыло
    class Wing {
        private int weight; // Поле для хранения веса крыла

        // Конструктор для установки веса крыла
        public Wing(int weight) {
            this.weight = weight;
        }

        // Метод для отображения веса крыла
        public void showWeight() {
            System.out.println("Вес крыла: " + weight + " кг");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объект самолета
        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane();

        // Создаем объекты крыльев с разным весом
        Airplane.Wing wing1 = airplane1.new Wing(1200); // Крыло 1
        Airplane.Wing wing2 = airplane2.new Wing(1350); // Крыло 2

        // Вывод информации про вес крыльев
        System.out.println("Информация о крыльях самолета 1:");
        wing1.showWeight();

        System.out.println("Информация о крыльях самолета 2:");
        wing2.showWeight();
    }
}