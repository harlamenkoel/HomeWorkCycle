public class HomeWorkCycle {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        System.out.println();
        int initialAmount = 0;
        final int AMOUNT = 2_459_000;
        int contribution = 15_000;
        int monthAmount = 0;

        while (initialAmount <= AMOUNT) {
            monthAmount++;
            initialAmount += contribution;
            System.out.println("Месяц " + monthAmount + ", сумма накоплений равна " + initialAmount + " рублей");
        }
        //Задание 2
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        int i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        //Задание 3
        System.out.println();
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        int population = 12_000_000;
        final int BIRTHRATE = 17;
        final int MORTALITY = 8;
        int year = 0;
        for (int j = 0; j < 10; j++) {
            year++;
            population = population + (population / 1000) * (BIRTHRATE - MORTALITY);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //Задание 4
        System.out.println();
        System.out.println("Задание 4");
        System.out.println();
        int contribution1 = 15_000;
        final int PERCENT = 7;
        int desiredAmount = 12_000_000;
        int month = 0;

        while (contribution1 < desiredAmount) {
            contribution1 = contribution1 + (contribution1 * PERCENT / 100);
            month++;
            System.out.println("Месяц " + month + " ,сумма накоплений " + contribution1);


        }
        //Задание 5
        System.out.println();
        System.out.println("Задание 5");
        System.out.println();
        contribution1 = 15_000;
        month = 0;

        while (contribution1 < desiredAmount) {
            contribution1 = contribution1 + (contribution1 * PERCENT / 100);
            month++;
            if (month % 6 == 0) {
                System.out.println("Накопления за " + month + " месяцев составляет " + contribution1);
            }
        }
        //Задание 6
        System.out.println();
        System.out.println("Задание 6");
        System.out.println();
        contribution1 = 15_000;
        month = 0;
        int years = 9;
        final int MONTHS_YEAR = 12;

        while (month < years * MONTHS_YEAR) {
            contribution1 = contribution1 + (contribution1 * PERCENT / 100);
            month++;
            if (month % 6 == 0) {
                System.out.println("Накопления за " + month + " месяцев составляет " + contribution1);
            }
        }
        //Задание 7
        System.out.println();
        System.out.println("Задание 7");
        System.out.println();
        int firstFriday = 2;

        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
            firstFriday += 7;
        }
        //Задание 8
        System.out.println();
        System.out.println("Задание 8");
        System.out.println();
        final int COMETS_PASSING = 79;
        int currentYear = 2022;
        int openingBalance = currentYear - 200;
        int closeBalance = currentYear + 100;
        int period = 0;

        while (period <= currentYear) {
            period += COMETS_PASSING;

            if (period >= openingBalance && period <= closeBalance) {
                System.out.println("Комета пролетит в " + period + " году");
            }
        }
        //Задание 9
        System.out.println();
        System.out.println("Задание 9");
        System.out.println();
        int multiplier = 2;
        for (int m = 1; m <= 10; m++) {
            System.out.println(multiplier + "" + "*" + m + "=" + multiplier * m);
        }
    }
}
