package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
//        int[] array ={1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254}; //Для проверки. Верный ответ сумма 14535, индекс 5
        Random random = new Random();
//        Заполняем массив рандомными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int sumMax = 0;
        int sumMaxIdx = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > sumMax) {
                sumMax = sum;
                sumMaxIdx = i;
            }
        }
        System.out.println(sumMax);
        System.out.println(sumMaxIdx);
    }
}
