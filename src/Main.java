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

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int year = 0;
        int live = y / 1000 * 17;
        int dead = y / 1000 * 8;
        int size = y + (live - dead);
        while (year < 10) {
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + size);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        float salary = 15000f;
        float total = 0f;
        int month = 0;
        while (total <= 12_000_000) {
            //total = total * 1.07f;
            total = (total + salary) * 1.07f;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        float salary = 15000f;
        float total = 0f;
        int month = 0;
        while (total <= 12_000_000) {
            total = (total + salary) * 1.07f;
            month++;
            if (month % 6 == 0 || month == 59) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        float salary = 7500f;
        float total = 0f;
        float month = 0f;
        while (month < 9) {
            total = (total + salary) * 1.07f;
            month += 0.5;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int report = 5; report < 31; report += 7) {
            System.out.println("Сегодня пятница, " + report + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        for (int i = 0; i < 2123; i += 79)
            if (i >= 1823) {
                System.out.println(i);
            }
    }
}