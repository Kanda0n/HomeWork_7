public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int sum = 0;
        int capital = 15000;
        int j = 0;
        while (sum < 2459000) {
            sum += capital;
            j++;
        }
        System.out.println("Месяц " + j + ", сумма накоплений равна "
                + sum + " рублей.");

        System.out.println("Task 2");
        int k = 1;
        while (k <= 10) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println();
        for (k = 10; k > 0; k--) {
            System.out.print(k + " ");
        }
        System.out.println();

        System.out.println("Task 3");
        int population = 12000000;
        int birthRatePerThousand = 17;
        int deathRatePerThousand = 8;
        for (int i = 1; i <= 10; i++) {
            population += population / 1000 * birthRatePerThousand - population / 1000 * deathRatePerThousand;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        System.out.println("Task 4");
        int capitalOfVasiliy = 15000;
        int month = 1;
        while (capitalOfVasiliy < 12000000) {
            capitalOfVasiliy += capitalOfVasiliy / 100 * 7;
            System.out.println("Месяц " + month + ", сумма накоплений Василия " + capitalOfVasiliy);
            month++;
        }

        System.out.println("Task 5");
        capitalOfVasiliy = 15000;
        month = 1;
        while (capitalOfVasiliy < 12000000) {
            capitalOfVasiliy += capitalOfVasiliy / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений Василия " + capitalOfVasiliy);
            }
            month++;
        }
        System.out.println("Месяц " + (month - 1) + ", Василий накопил " + capitalOfVasiliy);

        System.out.println("Task 6");
        capitalOfVasiliy = 15000;
        month = 1;
        while (month <= 108) {
            capitalOfVasiliy += capitalOfVasiliy / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений Василия " + capitalOfVasiliy);
            }
            month++;
        }

        System.out.println("Task 7");
        int firstFriday = 3;
        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет!");
            firstFriday += 7;
        }

        System.out.println("Task 8");
        int year = 2024;
        int periodStart = year - 200;
        int periodEnd = year + 100;
        for (int i = periodStart; i <= periodEnd; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
                i += 78;
            }
        }
    }
}