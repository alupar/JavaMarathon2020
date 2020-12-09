package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        // Заполняем массив рандомными числами
        for (int i = 0; i < array.length; i++) {
            //array[i] = (int) (Math.random() * 10); //Альтернатива, но надо закомментироть все random
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));
        int max = 0;
        int min = 10000;
        for (int arr : array) {
            if (arr > max)
                max = arr;
            if (arr < min)
                min = arr;
        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);

        int counter = 0;
        for (int arr : array) {
            if (arr % 10 == 0)
                counter++;
        }
        int sum = 0;
        for (int arr : array) {
            if (arr % 10 == 0) {
                //System.out.println(arr);
                sum += arr;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + counter);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum);
    }
}
