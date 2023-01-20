public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int cash = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + cash;
            i++;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while (i<=10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int b = 10 ; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + (population / 1000 * fertility) - (population / 1000 * mortality);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int cash = 15000;
        int total = 0;
        for (int i = 1; total < 12_000_000; i++) {
            total = total + total / 100 * 7 + cash;
            System.out.println("Месяц " + i + ". Сумма накоплений " + total);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int cash = 15000;
        int total = 0;
        for (int i = 1; total < 12_000_000; i++) {
            total = total + total / 100 * 7 + cash;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ". Сумма накоплений " + total);
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int cash = 15000;
        int total = 0;
        for (int i = 1; i <= 9 * 12; i++) {
            total = total + total / 100 * 7 + cash;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ". Сумма накоплений " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFraiday = 5;
        for (int day = firstFraiday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int cometPeriod = 79;
        int cometFlyes = 0;
        int currentYear = 2023;
        int yearCometFlyes = 1896;
        do {
            cometFlyes = cometFlyes + cometPeriod;
            if (yearCometFlyes < currentYear + 100) {
                System.out.println(yearCometFlyes);
            }
            yearCometFlyes = yearCometFlyes + cometPeriod;
        } while (cometFlyes < 300);
    }
}