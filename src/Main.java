
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            total += salary;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        //Задача 2
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (; number > 1; ) {
            number--;
            System.out.print(number + " ");
        }
        System.out.println();
        //Задача 3
        int peoples = 12000000;
        double kb = 1.017;
        double kd = 0.992;
        int years = 1;
        for (; years < 10; years++) {
            peoples = (int) (peoples * kb * kd);
            System.out.println("Год " + years + ", численность населения составляет " + peoples);
        }

        //Задача 4
        salary = 15000;
        total = 0;
        int months = 0;
        while (total < 12000000) {
            total = (int) (total * 1.07);
            total += salary;
            months++;
            System.out.println("Месяц " + months + " сумма накоплений составляет " + total);
        }

        //Задача 5
        salary = 15000;
        total = 0;
        months = 0;
        while (total < 12000000) {
            total = (int) (total * 1.07);
            total += salary;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + " сумма накоплений составляет " + total);
            }
        }

        //Задача 6
        salary = 15000;
        total = 0;
        months = 0;
        for (; months < 108; ) {
            total = (int) (total * 1.07);
            total += salary;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + " сумма накоплений составляет " + total);
            }
        }

        //Задача 7
        int data = 3;
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            if ((dayNumber + 7 - data) % 7 == 0) {
                System.out.println("Сегодня пятница " + dayNumber + "-е число. Необходимо подготовить отчет");
            }
        }

        //Задача 8
        int yearBefore = 1825;
        int yearAfter = 2125;
        for (i = 0; i < yearAfter; i += 79) {
            if (i > yearBefore) {
                System.out.println(i);
            }
        }


    }
}