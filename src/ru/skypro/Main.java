package ru.skypro;

public class Main {

    public static void main(String[] args)
    {var a = 5;
        System.out.println("а=" + a);
        int b = 1;
        System.out.println("b=" + b);
        byte c = 127;
        System.out.println("с=" + c);
        short d = 32767;
        System.out.println("d=" + d);
        long e = 300/1000;
        System.out.println("e=" + e);
        double f = 0.7777778;
        System.out.println("f=" + f);
        float g = (float) 0.7777777777;
        System.out.println("g=" + g);
        char h = '?';
        System.out.println("h=" + h);
        int age = 44;


        double b1 = 78.2;
        double b2 = 82.7;
        double vse = b1 + b2;
        System.out.println("Общий вес бойцов =" + vse + "КГ");
        double r = b2 - b1;
        System.out.println("Разница весов =" + r + "КГ");


        int banan = 5 * 80;
        int milk = 2*105;
        int ice = 2*100;
        int eggs = 4*70;
        int ves = banan + milk + ice + eggs;
        double veskg = ves * 0.001;
        System.out.println("вес (количество грамм) такого спорт-завтрака =" + ves + "Г");
        System.out.println("вес (количество в КГ) такого спорт-завтрака =" + veskg + "КГ");

        int sbros = 7*1000;
        int day1 = 250;
        int day2 = 500;
        int v1 = sbros / day1;
        int v2 = sbros / day2;
        System.out.println("Если сбрасывать по 250г в день, то спортсмен скинет нужный вес за " + v1 + " дней");
        System.out.println("Если сбрасывать по 500г в день, то спортсмен скинет нужный вес за " + v2 + " дней");


        int M = 67760;
        int D = 83690;
        int K = 76320;
        double M1 = M * 1.1;
        double D1 = D * 1.1;
        double K1 = K * 1.1;
        int M2 = M * 12;
        int D2 = D * 12;
        int K2 = K * 12;
        double M3 = M1 * 12;
        double D3 = D1 * 12;
        double K3 = K1 * 12;
        double M4 = M3 - M2;
        double D4 = D3 - D2;
        double K4 = K3 - K2;
        System.out.println("После повышения Маша будет получать " + M1 + "рублей, " +"Денис будет получать " + D1 + "рублей, " + "a Кристина будет получать " + K1 + "рублей");
        System.out.println("После повышения ЗП годовой доход Маши вырос на " + M4 + "рублей, " + "Дениса на " + D4 + "рублей, " + "а Кристины на " + K4 + "рублей.");
    }

}


