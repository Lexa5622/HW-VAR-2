package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");

        int i = 200;
        byte b = 120;
        short sh = 10000;
        long l = 5L;
        float fl = 3f;
        double d = 5.62;

        System.out.println("Значение переменной " + "i с типом int равно " + i);
        System.out.println("Значение переменной " + "b с типом byte равно " + b);
        System.out.println("Значение переменной " + "sh с типом short равно " + sh);
        System.out.println("Значение переменной " + "l с типом long равно " + l);
        System.out.println("Значение переменной " + "fl с типом float равно " + fl);
        System.out.println("Значение переменной " + "d с типом double равно " + d);

        System.out.println("Задание 2");
        short sh2 = 569;
        long l2 = 987678965549L;
        float fl2 = 27.12f;
        double d2 = 2.786;
        byte b2 = 67;
        int i2 = 27897;
        var v = -159;

        System.out.println("Задание 3");
        int quantityLudmila = 23;
        int quantityHanna = 27;
        int quantityKate = 30;
        int allPaper = 480;

        int allPupils = quantityLudmila + quantityHanna + quantityKate;
        int listPerPupil = allPaper/allPupils;

        System.out.println("На каждого ученика рассчитано " + listPerPupil + " листов бумаги.");

        System.out.println("Задание 4");
        int amountbottle = 16;
        int amountbottlePerTime = 2;
        int amountbottlePerMinute = amountbottle/amountbottlePerTime;

        int timeMinute = 20;
        int timeDay = 60 * 24;
        int someTimeDay = timeDay * 3;
        int timeMonth = timeDay * 30;

        System.out.println("За " + timeMinute + " минут машина произвела " + amountbottlePerMinute * timeMinute + " штук бутылок.");
        System.out.println("За " + timeDay/timeDay + " день машина произвела " + amountbottlePerMinute * timeDay + " штук бутылок.");
        System.out.println("За " + someTimeDay/timeDay + " дня машина произвела " + amountbottlePerMinute * someTimeDay + " штук бутылок.");
        System.out.println("За " + timeMonth/timeDay + " дней машина произвела " + amountbottlePerMinute * timeMonth + " штук бутылок.");

        System.out.println("Задание 5");
        int canOfPaint = 120;
        int canOfWhitePaintUse = 2;
        int canOfBrownPaintUse = 4;

        int canByClass = canOfWhitePaintUse + canOfBrownPaintUse;
        int amountClasses = canOfPaint / canByClass;

        int amountWhitePaint = amountClasses * canOfWhitePaintUse;
        int amountBrownPaint = amountClasses * canOfBrownPaintUse;

        System.out.println("В школе, где " + amountClasses + " классов, нужно " + amountWhitePaint + " банок белой краски и " + amountBrownPaint + " банок коричневой краски.");

        System.out.println("Задание 6");
        int bananasPart = 5;
        int oneBananaPartWeight = 80;
        int milkPart = 2;
        int oneMilkPartWeight = 105;
        int iceCreamPart = 2;
        int oneIceCreamPartWeight = 100;
        int eggsPart = 4;
        int oneEggPartWeight = 70;

        int allBananas = bananasPart * oneBananaPartWeight;
        int allMilk = milkPart * oneMilkPartWeight;
        int allIcecream = iceCreamPart * oneIceCreamPartWeight;
        int allEggs = eggsPart * oneEggPartWeight;

        int inBlender = allBananas + allMilk + allIcecream + allEggs;
        float weightPerKilo  = (float) inBlender / 1000;

        System.out.println("Вес спортивного завтрака составляет " + inBlender + " грамм или " + weightPerKilo + " килограмм" );

        System.out.println("Задание 7");
        int loseWeightKilo = 7;
        int loseWeightGramm = loseWeightKilo * 1000;

        int firstCorrectGramm = 250;
        int secondCorrectGramm = 500;

        int firstDaysLoseWeight = loseWeightGramm / firstCorrectGramm;
        int secondDaysLoseWeight = loseWeightGramm / secondCorrectGramm;
        int averageDaysLoseWeight = (firstDaysLoseWeight + secondDaysLoseWeight) / 2;

        System.out.println(firstDaysLoseWeight);
        System.out.println(secondDaysLoseWeight);
        System.out.println(averageDaysLoseWeight);

        System.out.println("Задание 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaFirstRevenue = mashaSalary * 12;
        int denisFirstRevenue = denisSalary * 12;
        int kristinaFirstRevenue = kristinaSalary * 12;

        double index = 0.1;

        double indexMashaSalary = mashaSalary * index;
        double indexDenisSalary = denisSalary * index;
        double indexKristinaSalary = kristinaSalary * index;

        double newMashaSalary = mashaSalary + indexMashaSalary;
        double newDenisSalary = denisSalary + indexDenisSalary;
        double newKristinaSalary = kristinaSalary + indexKristinaSalary;
        double mashaSecondRevenue = newMashaSalary * 12;
        double denisSecondRevenue = newDenisSalary * 12;
        double kristinaSecondRevenue = newKristinaSalary * 12;

        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + (mashaSecondRevenue - mashaFirstRevenue) + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + (denisSecondRevenue - denisFirstRevenue) + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + (kristinaSecondRevenue - kristinaFirstRevenue) + " рублей");


        System.out.println();
    }
}
