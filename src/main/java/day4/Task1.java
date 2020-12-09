package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[scanner.nextInt()];
        // Заполняем массив рандомными числами
        for (int i = 0; i < array.length; i++) {
            //array[i] = (int) (Math.random() * 10); //Альтернатива, но надо закомментироть все random
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array)); //Выводим весь массив в консоль
        System.out.println("Длина массива: " + array.length);

        int count8 = 0;
        int count1 = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                count8++;
            if (array[i] == 1)
                count1++;
            if (array[i] % 2 == 0)
                countEven++;
            if (array[i] % 2 != 0)
                countOdd++;
            sum += array[i];
        }
        System.out.println("Количество цифр больше 8: " + count8);
        System.out.println("Количество цифр равных 1: " + count1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
