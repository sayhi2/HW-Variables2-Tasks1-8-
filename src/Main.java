public class Main {
    public static void main(String[] args) {
        //Task1
        byte b = -128;
        short s = -32768;
        int i = 2_147_483_647;
        long lng = -9223372036854775808L;
        float fl = 3.4028235E38f;
        double d = 1.7976931348623158E308;
        char a = 'a';
        boolean e = true;
        System.out.println(b + "\n" + s + "\n" + i + "\n" + lng + "\n" + fl + "\n" + d + "\n" + a + "\n" + e);

        //Task2
        float f = 27.12f;
        long l = 987678965549L;
        byte b1 = 2;
        short s1 = 786;
        boolean bool = false;
        short s2 = -159;
        short s3 = 27897;
        byte b2 = 67;
        System.out.println(f + "\n" + l + "\n" + b1 + "\n" + s1 + "\n" + bool + "\n" + s2 + "\n" + s3 + "\n" + b2);

        //Task3
        int classLP = 23;
        int classAS = 27;
        int classEA = 30;
        int totalPaperSheets = 480 / (classLP + classAS + classEA);
        System.out.printf("На каждого ученика рассчитано %d лисов бумаги", totalPaperSheets);



        //Task4
        byte productPerMinute = 16 / 2;
        int productPer20 = productPerMinute * 20;
        int productPerDay = productPerMinute * 60 * 24;
        int productPerTreeDays = productPerDay * 3;
        int productPerMonth = productPerDay * 30;
        System.out.printf("За %s машина произвела бутылок %d штук \n", "20 минут", productPer20);
        System.out.printf("За %s машина произвела бутылок %d штук \n", "1 день", productPerDay);
        System.out.printf("За %s машина произвела бутылок %d штук \n", "3 дня", productPerTreeDays);
        System.out.printf("За %s машина произвела бутылок %d штук \n", "месяц", productPerMonth);

        //Task5
        byte paintCan = 120;
        byte whitePaintCan = 2;
        byte brownPaintCan = 4;
        int roomAmount = paintCan / (whitePaintCan + brownPaintCan);
        System.out.printf("В школе, где %s классов, нужно %d банок белой краски и %d банок коричневой краски", roomAmount, roomAmount * whitePaintCan, roomAmount * brownPaintCan);

        //Task6
        short bananaWeight = 80;
        short milkWeight = 105;
        short iceCreamWeight = 100;
        short eggsWeight = 70;
        float gramsInKg = 1000;

        short bananaAmount = 5;
        short milkAmount = 2;
        short iceCreamAmount = 2;
        short eggsAmount = 4;
        int result = (bananaWeight * bananaAmount) + (milkWeight * milkAmount) + (iceCreamWeight * iceCreamAmount) + (eggsWeight * eggsAmount);
        float breakfastWeight = result / gramsInKg;
        System.out.println("Вес завтрака: " + breakfastWeight + "кг");

        //Task7
        int grammsInKg = 1000;
        int weightToLose = 7 * grammsInKg;
        int weightToLose500 = weightToLose / 500;
        int weightToLose250 = weightToLose / 250;
        int averageWeightToLose = (weightToLose250 + weightToLose500) / 2;
        System.out.println("Max: " + weightToLose500);
        System.out.println("Min: " + weightToLose250);
        System.out.println("В среднем: " + averageWeightToLose);

        //Task8
        System.out.println(" Задача8 ");
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int chrisSalary = 76_230;
        int percent = 10;
        float newSalaryMultiplier = 1 + (percent / 100f);
        float mashaNewSalary = mashaSalary * newSalaryMultiplier;
        float mashaTotalSalaryDifference = (mashaNewSalary - mashaSalary) * 12;
        float denisNewSalary = denisSalary * newSalaryMultiplier;
        float denisTotalSalaryDifference = (denisNewSalary - denisSalary) * 12;
        float chrisNewSalary = chrisSalary * newSalaryMultiplier;
        float chrisTotalSalaryDifference = (chrisNewSalary - chrisSalary) * 12;
        System.out.println("Маша теперь получает: " + mashaNewSalary + ". " + " годовой доход вырос на " + mashaTotalSalaryDifference + " руб ");
        System.out.println("Денис теперь получает: " + denisNewSalary + ". " + " годовой доход вырос на " + denisTotalSalaryDifference + " руб ");
        System.out.println("Кристина теперь получает: " + chrisNewSalary + ". " + " годовой доход вырос на " + chrisTotalSalaryDifference + " руб ");








    }
}