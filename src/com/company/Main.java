package com.company;

public class Main {

    public static void main(String[] args) {

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

        short sh2 = 569;
        long l2 = 987678965549L;
        float fl2 = 27.12f;
        double d2 = 2.786;
        byte b2 = 67;
        int i2 = 27897;
        short minusSH = -159;

        var quantityLudmila = 23;
        var quantityHanna = 27;
        var quantityKate = 30;
        var allPaper = 480;

        var allPupils = quantityLudmila + quantityHanna + quantityKate;
        var listPerPupil = allPaper/allPupils;

        System.out.println("На каждого ученика рассчитано " + listPerPupil + " листов бумаги.");

        var amountbottle = 16;
        var amountbottlePerTime = 2;
        var amountbottlePerMinute = amountbottle/amountbottlePerTime;

        var timeMinute = 20;
        var timeDay = 60 * 24;
        var someTimeDay = timeDay * 3;
        var timeMonth = timeDay * 30;

        System.out.println("За 20 минут машина произвел " + amountbottlePerMinute * timeMinute + " штук бутылок.");
        System.out.println("За сутки машина произвел " + amountbottlePerMinute * timeDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвел " + amountbottlePerMinute * someTimeDay + " штук бутылок.");
        System.out.println("За месяц машина произвел " + amountbottlePerMinute * timeMonth + " штук бутылок.");


        var canOfPaint = 120;
        var canOfWhitePaintUse = 2;
        var canOfBrownPaintUse = 4;

        var canByClass = canOfWhitePaintUse + canOfBrownPaintUse;
        var amountClasses = canOfPaint / canByClass;

        var amountWhitePaint = amountClasses * canOfWhitePaintUse;
        var amountBrownPaint = amountClasses * canOfBrownPaintUse;

        System.out.println("В школе, где " + amountClasses + " классов, нужно " + amountWhitePaint + " банок белой краски и " + amountBrownPaint + " банок коричневой краски.");


        var bananasPart = 5;
        var oneBananaPartWeight = 80;
        var milkPart = 2;
        var oneMilkPartWeight = 105;
        var iceСreamPart = 2;
        var oneIceСreamPartWeight = 100;
        var eggsPart = 4;
        var oneEggPartWeight = 70;

        var allBananas = bananasPart * oneBananaPartWeight;
        var allMilk = milkPart * oneMilkPartWeight;
        var allIcecream = iceСreamPart * oneIceСreamPartWeight;
        var allEggs = eggsPart * oneEggPartWeight;

        var inBlender = allBananas + allMilk + allIcecream + allEggs;
        var weightPerKilo  = (float) inBlender / 1000;

        System.out.println("Вес спортивного завтрака составляет " + inBlender + " грамм или " + weightPerKilo + " килограмм" );


        var loseWeightKilo = 7;
        var loseWeightGramm = loseWeightKilo * 1000;

        var firstCorrectGramm = 250;
        var secondCorrectGramm = 500;

        var firstDaysLoseWeight = loseWeightGramm / firstCorrectGramm;
        var secondDaysLoseWeight = loseWeightGramm / secondCorrectGramm;
        var averageDaysLoseWeight = (firstDaysLoseWeight + secondDaysLoseWeight) / 2;

        System.out.println(firstDaysLoseWeight);
        System.out.println(secondDaysLoseWeight);
        System.out.println(averageDaysLoseWeight);

        var mashaSalary = 67760;
        var denisSalary = 83690;
        var kristinaSalary = 76230;
        var mashaFirstRevenue = mashaSalary * 12;
        var denisFirstRevenue = denisSalary * 12;
        var kristinaFirstRevenue = kristinaSalary * 12;

        var index = 0.1;

        var indexMashaSalary = mashaSalary * index;
        var indexDenisSalary = denisSalary * index;
        var indexKristinaSalary = kristinaSalary * index;

        var newMashaSalary = mashaSalary + indexMashaSalary;
        var newDenisSalary = denisSalary + indexDenisSalary;
        var newKristinaSalary = kristinaSalary + indexKristinaSalary;
        var mashaSecondRevenue = newMashaSalary * 12;
        var denisSecondRevenue = newDenisSalary * 12;
        var kristinaSecondRevenue = newKristinaSalary * 12;

        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + (mashaSecondRevenue - mashaFirstRevenue) + "рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + (denisSecondRevenue - denisFirstRevenue) + "рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + (kristinaSecondRevenue - kristinaFirstRevenue) + "рублей");



    }
}
