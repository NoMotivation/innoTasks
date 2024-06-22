package ru.innopolis.java.homeworks.homework05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Television[] televisions = new Television[10];
        for (int i = 0; i < televisions.length; i++) {
            televisions[i] = new Television();
        }

        televisions[0].setTvModel(TVModels.SAMSUNG);
        televisions[0].setTvPrice(1200);
        televisions[0].setChannel(7);
        televisions[0].setVolume(69);
        televisions[0].setIsTurnOn(true);

        televisions[1].setTvModel(TVModels.PANASONIC);
        televisions[1].setTvPrice(4500);
        televisions[1].setChannel(99);
        televisions[1].setVolume(98);
        televisions[1].setIsTurnOn(true);

        televisions[2].setTvModel(TVModels.SONY);
        televisions[2].setTvPrice(1390);
        televisions[2].setChannel(2);
        televisions[2].setVolume(10);
        televisions[2].setIsTurnOn(false);

        televisions[3].setTvModel(TVModels.SAMSUNG);
        televisions[3].setTvPrice(2130);
        televisions[3].setChannel(23);
        televisions[3].setVolume(1);
        televisions[3].setIsTurnOn(true);

        televisions[4].setTvModel(TVModels.PANASONIC);
        televisions[4].setTvPrice(990);
        televisions[4].setChannel(33);
        televisions[4].setVolume(67);
        televisions[4].setIsTurnOn(true);

        televisions[5].setTvModel(TVModels.LG);
        televisions[5].setTvPrice(845);
        televisions[5].setChannel(9);
        televisions[5].setVolume(68);
        televisions[5].setIsTurnOn(false);

        televisions[6].setTvModel(TVModels.SONY);
        televisions[6].setTvPrice(3333);
        televisions[6].setChannel(79);
        televisions[6].setVolume(51);
        televisions[6].setIsTurnOn(true);

        televisions[7].setTvModel(TVModels.PHILIPS);
        televisions[7].setTvPrice(690);
        televisions[7].setChannel(10);
        televisions[7].setVolume(60);
        televisions[7].setIsTurnOn(true);

        televisions[8].setTvModel(TVModels.LG);
        televisions[8].setTvPrice(990);
        televisions[8].setChannel(11);
        televisions[8].setVolume(60);
        televisions[8].setIsTurnOn(false);

        televisions[9].setTvModel(TVModels.SAMSUNG);
        televisions[9].setTvPrice(4300);
        televisions[9].setChannel(91);
        televisions[9].setVolume(69);
        televisions[9].setIsTurnOn(true);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение максимальной громкости: ");
        int maxVolume = scanner.nextInt();
        boolean flagMaxVolume = false;
        while (!flagMaxVolume) {
            if (maxVolume < 50 || maxVolume > 70) {
                System.out.println("Максимальная громкость должна быть от 50 до 70");
                maxVolume = scanner.nextInt();
            } else {
                flagMaxVolume = true;
            }
        }

        bubbleSort(televisions);

        for (Television television : televisions) {
            if (television.getIsTurnOn() && television.getVolume() <= maxVolume){
                System.out.println(television);
            }
        }
    }

    private static void bubbleSort(Television[] televisions) {
        for (int i = 0; i < televisions.length - 1; i++) {
            for (int j = 0; j < televisions.length - i - 1; j++) {
                if (televisions[j].getChannel() > televisions[j + 1].getChannel()){
                    Television swapTelevision = televisions[j];
                    televisions[j] = televisions[j + 1];
                    televisions[j + 1] = swapTelevision;
                }
            }
        }
    }
}
