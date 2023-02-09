import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Задача 1------");
        task1();
        System.out.println();
        System.out.println("------Задача 2------");
        task2();
        System.out.println("");
        System.out.println("------Задача 3------");
        task3();
        System.out.println("");
        System.out.println("------Задача 4------");
        task4();
        System.out.println("");
        System.out.println("------Задача 5------");
        task5();
        System.out.println("");
        System.out.println("------Задача 6------");
        task6();
        System.out.println("");
        System.out.println("------Задача 7------");
        task7();
        System.out.println("");
        System.out.println("------Задача 8------");
        task8();
        System.out.println("");
        System.out.println("------Задача 9------");
        task9();
        System.out.println("");
        System.out.println("------Задача 10------");
        task10();
        System.out.println("");
    }


    public static void task1() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Номер итерации " + i);
        }
    }

    public static void task2() {
        for (int i = 10; i > 0; i--) {
            System.out.println("обратная итерации " + i);
        }
    }

    public static void task3() {
        for (int i = 0; i < 17; i = i + 2) {
            if (i % 2 == 0 && i > 0) {
                System.out.println("Из задданых чисел от 1 до 17 четное число " + i);
            }
        }
    }

    public static void task4() {
        for (int i = 10; i > -11; i--) {
            System.out.println("Обратный счет " + i);
        }
    }

    public static void task5() {
        int startYear = 1904;
        int endYear = 2096;
        for (int year = startYear; year <= endYear; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println(year + " год является високостным ");
            }
        }
    }

    public static void task6() {
       for (int i = 7; i <=98 ; i+=7) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void task7() {
        int factor = 2;
        int result = 1;
        for (int i = 1; i < 11; i++) {
            System.out.print(result + " ");
            result = result * factor;
        }
        System.out.println();
    }

    public static void task8() {
        int moneyInYear = 29_000;
        int totalMoney = 0;
        for (int i = 1; i < 13; i++) {
            totalMoney = totalMoney + moneyInYear;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalMoney + " рублей");
        }
    }

    public static void task9() {
        int moneyInYear = 29000;
        double totalMoney = 0;
        for (int i = 1; i < 13; i++) {
            totalMoney = totalMoney + totalMoney / 100;
            totalMoney = totalMoney + moneyInYear;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalMoney + " рублей");
        }
    }

    public static void task10() {
        int factor = 2;
        for (int i = 1; i < 11; i = ++i) {
            System.out.println(i * factor);
        }
    }

}


