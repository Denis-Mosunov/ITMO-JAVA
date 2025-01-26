package Lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Вводим строку
        String inputString = getInputString();

        // Вызов методов, результаты которых возвращаются и выводятся
        System.out.println(Exercise1(inputString));
        System.out.println(Exercise2());
        System.out.println(Exercise3());
        System.out.println(Exercise4());
        System.out.println(Exercise5());
    }

    // Метод для ввода строки
    private static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        return scanner.nextLine();
    }

    // Упражнение 1: Поиск самого длинного слова в строке
    private static String Exercise1(String str) {
        String[] words = str.split(" "); // Разделяем строку на слова
        String longestWord = words[0];  // Изначально самое длинное слово - первое
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; // Обновляем самое длинное слово
            }
        }
        return String.format("Самое длинное слово в строке: \"%s\"", longestWord);
    }

    // Упражнение 2: Проверка на палиндром
    private static String Exercise2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        // Создаем StringBuilder и переворачиваем слово
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        if (word.contentEquals(sb))
            return String.format("Слово \"%s\" полиндром!", word);
        else
            return String.format("Слово \"%s\" не полиндром.", word);
    }

    // Упражнение 3: Замена "бяка" на цензуру
    private static String Exercise3() {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        // Создаем из строки массив слов
        String[] arrayWord = str.split(" ");
        // Перебираем слова в массиве
        for (String word : arrayWord) {
            // Если нашли запретное слово заменяем его и добавляем в StringBuilder
            if (word.equals("бяка") || word.equals("Бяка"))
                sb.append(" [вырезано цензурой]");
                // Иначе копируем слово без изменений
            else
                sb.append(String.format(" %s", word));
        }
        // Убираем пробел в начале и возвращаем результат
        return sb.replace(0, 1, "").toString();
    }

    // Упражнение 4: Поиск вхождений подстроки
    private static String Exercise4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основную строку: ");
        String str = scanner.nextLine();
        System.out.print("Введите подстроку для поиска: ");
        String subStr = scanner.nextLine();

        // Создаем массив символов из исходной строки
        char[] strChar = str.toCharArray();
        String strComparison;
        int count = 0;

        // Идем по символам
        for (int i = 0; i < strChar.length; i++) {
            // Сравниваем каждый символ с первым символом подстроки
            if (strChar[i] == subStr.charAt(0)) {
                // Если нашли похожий символ, то записываем подстроку из исходной строки
                strComparison = str.substring(i, i + subStr.length());
                // Сравниваем строку с искомой подстрокой и увеличиваем счетчик
                if (strComparison.equals(subStr)) count++;
            }
        }
        return String.format("В веденной Вами строке найдено вхождений: %d", count);
    }

    // Упражнение 5: Переворот слов
    private static String Exercise5() {
        // Создаем вспомогательный StringBuilder
        StringBuilder sbRevers = new StringBuilder();
        StringBuilder finalWordSB = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        // Создаем массив слов из строки
        String[] arrayWord = str.split(" ");
        for (String word : arrayWord) {
            // Очищаем StringBuilder
            sbRevers.setLength(0);
            // Добавляем перевернутое слово в финальный StringBuilder
            finalWordSB.append(String.format(" %s", sbRevers.append(word).reverse()));
        }
        // Убираем пробел в начале и возвращаем результат
        return finalWordSB.replace(0, 1, "").toString();
    }
}