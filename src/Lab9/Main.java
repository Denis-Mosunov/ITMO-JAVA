package Lab9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
    }

    private static void Exercise1() {
        List<Object> objects = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j < 7; j++) {
                objects.add(j);
            }
            objects.add(i);
        }

        System.out.printf("Получаем коллекцию объектов: %s\n", objects);
        Set<Object> uniqueObjects = RemoveDuplicate(objects);
        System.out.printf("Преобразуем коллекцию в набор и получаем объекты без дубликатов: %s\n", uniqueObjects);
    }

    private static void Exercise2() {
        long arrayListTime = measurePerformance(new ArrayList<>());
        long linkedListTime = measurePerformance(new LinkedList<>());

        System.out.printf("\nУпражнение 2.\nВремя выполнения ArrayList: %d мс.\n", arrayListTime);
        System.out.printf("Время выполнения LinkedList: %d мс.\n", linkedListTime);
    }

    private static void Exercise3() {
        Scanner scanner = new Scanner(System.in);
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("MifUcii"), (int) (Math.random() * 100));
        map.put(new User("Phantom"), (int) (Math.random() * 100));
        map.put(new User("Simple"), (int) (Math.random() * 100));
        map.put(new User("Zeus"), (int) (Math.random() * 100));

        System.out.print("\nУпражнение 3.\nВведите имя игрока: ");
        String name = scanner.nextLine();
        String result = getPlayerResult(map, name);
        System.out.println(result);
    }

    private static void Exercise4() {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.printf("\nУпражнение 4. Генерируем массив:\n%s\n", Arrays.toString(array));
        Map<Integer, Integer> frequencyMap = ArrayToMap(array);
        frequencyMap.forEach((key, value) -> System.out.printf("Значение %d имеет %d вхождений.\n", key, value));
    }

    private static Set<Object> RemoveDuplicate(List<Object> objects) {
        return new HashSet<>(objects);
    }

    private static long measurePerformance(List<Integer> list) {
        long start, end;

        // Заполнение списка
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add((int) (Math.random() * 10));
        }
        end = System.currentTimeMillis();
        long fillTime = end - start;

        // Доступ к случайным элементам
        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list.get((int) (Math.random() * list.size()));
        }
        end = System.currentTimeMillis();
        return fillTime + (end - start);
    }

    private static String getPlayerResult(Map<User, Integer> map, String name) {
        for (var entry : map.entrySet()) {
            if (entry.getKey().getName().equals(name)) {
                return String.format("Результат игрока: %d очков", entry.getValue());
            }
        }
        return "Пользователь с таким именем не найден.";
    }

    public static <K> Map<K, Integer> ArrayToMap(K[] array) {
        Map<K, Integer> map = new HashMap<>();
        for (K element : array) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        return map;
    }

    static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        public int hashCode() {
            return Objects.hash(name);
        }
    }
}