package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //System.out.println("Введите количество этажей");
        Scanner scanner = new Scanner(System.in);
        int stage = scanner.nextInt();
        if (stage > 0 && stage < 5) {
            System.out.println("Малоэтажный дом");
        } else if (stage >= 5 && stage < 9) {
            System.out.println("Среднеэтажный дом");
        } else if (stage >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
