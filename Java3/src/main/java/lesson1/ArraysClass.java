package lesson1;

import java.util.ArrayList;

public class ArraysClass {
    // 1. Написать метод, который меняет два элемента массива местами
    // (массив может быть любого ссылочного типа);
    public static <T> T[] shiftArray(T[] array, int dest, int source) {
        T tempElement = array[dest];
        array[dest] = array[source];
        array[source] = tempElement;
        return array;
    }

    // 2. Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList convertArray(T[] array) {
        ArrayList<T> tempArrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            tempArrayList.add(array[i]);
        }
        return tempArrayList;
    }

}

