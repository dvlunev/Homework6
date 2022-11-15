public class Main {
    public static void main(String[] args) {
        // Задание 1-1
        System.out.println("Задание 1-1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        // Задание 2-1
        System.out.println("Задание 2-1");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        // Задание 3-1
        System.out.println("Задание 3-1");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Все четные числа от 0 до 17: " + i);
        }
        System.out.println(" ");
        // Задание 4-1
        System.out.println("Задание 4-1");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Все числа от 10 до -10: " + i);
        }
        System.out.println(" ");
        // Задание 1-2
        System.out.println("Задание 1-2");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println(" ");
        // Задание 2-2
        System.out.println("Задание 2-2");
        for (int i = 7;i <= 98;i += 7) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        // Задание 3-2
        System.out.println("Задание 3-2");
        for (int i = 1;i <= 512;i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        // Задание 1-3
        System.out.println("Задание 1-3");
        int postpone = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += postpone;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total + " рублей");
        }
        System.out.println(" ");
        // Задание 2-3
        System.out.println("Задание 2-3");
        double postpone1 = 29000;
        double total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 += postpone1;
            total1 = total1 + total1 / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total1 + " рублей");
        }
    }
}