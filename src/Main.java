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
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total/100;
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2 () {
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
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 1
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 1
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 1
    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 1
    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 1
    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 1
    }
}