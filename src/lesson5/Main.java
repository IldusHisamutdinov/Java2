package lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FirstArray firstArray = new FirstArray();
        SecondArray secondArray = new SecondArray();

        firstArray.startArr();
        System.out.println("Вычисление с разделением массива:");
        secondArray.startArr();
        System.out.println("Массивы равны? - " + Arrays.equals(firstArray.floatArr, secondArray.floatArr));
    }
}
