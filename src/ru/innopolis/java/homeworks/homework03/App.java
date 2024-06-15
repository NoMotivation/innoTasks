package ru.innopolis.java.homeworks.homework03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Television tv1 = new Television(TVModels.LG, 100.7);
        tv1.setTvPrice(89.5);
        double newPrice = tv1.priceWithDiscount(10);
        tv1.setDiscountPrice(newPrice);
        tv1.setTvPrice(100);
        System.out.println(tv1);

        Television tv2 = new Television(TVModels.valueOf("PANASONIC"), 90);
        tv2.setDiscountPrice(tv2.priceWithDiscount(25));
        String tv2Info = tv2.toString();
        System.out.println(tv2Info);

        System.out.println(tv2.getTvModel());
        System.out.println(tv2.getTvPrice());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите модель телевизора");
        System.out.println("Доступные модели: SAMSUNG, LG, PANASONIC, PHILIPS, SONY");
        String model = scanner.nextLine();
        int randomPrice = (int) (Math.random() * 1000);
        Television tv3 = new Television(TVModels.valueOf(model), randomPrice);
        System.out.println(tv3);
    }
}
