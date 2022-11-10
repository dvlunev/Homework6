public class Main {
    public static void main(String[] args) {
        // Задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        // Задание 2
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        // Задание 3
        for (int i = 0; i <= 17; i = i+2) {
            System.out.println("Все четные числа от 0 до 17: " + i);
        }
        System.out.println(" ");
        // Задание 4
        for (int i = 10; i >= -10; i--) {
            System.out.println("Все числа от 10 до -10: " + i);
        }
        System.out.println(" ");
        // Задание 5
        for (int i = 1904;i <= 2096;i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println(" ");
        // Задание 6
        for (int i = 7;i <= 98;i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        // Задание 7
        for (int i = 1;i <= 512;i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        // Задание 8
        int postpone = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + postpone;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total + " рублей");
        }
        System.out.println(" ");
        // Задание 9
        int postpone1 = 29000;
        int total1 = 0;
        for (int i = 0; i < 12; i++) {
            total1 = total1 + total / 100;
            total1 = total1 + postpone1;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total1 + " рублей");
        }
    }
}