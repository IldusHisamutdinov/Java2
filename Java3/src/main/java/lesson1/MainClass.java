package lesson1;

import java.util.Arrays;

import static lesson1.ArraysClass.convertArray;
import static lesson1.ArraysClass.shiftArray;

public class MainClass {

    public static void main(String[] args) {
        //Для теста создадим объекты

        Integer[] integerArray = new Integer[]{1,2,3,4,5,6,7,8,9,0};
        String[] stringArray = new String[]{"1","2","3","4","5","6","7","8","9","0"};
        Apple[] appleArray = new Apple[]{new Apple(),new Apple(),new Apple()};

        //Поменяем местами элементы массива
        //Применим метод для массива Integer
        System.out.println("Исходный массив " + Arrays.toString(integerArray));
        System.out.println("Измененный массив " + Arrays.toString(shiftArray(integerArray,0,9)));
        //Применим метод для массива String
        System.out.println("Исходный массив " + Arrays.toString(stringArray));
        System.out.println("Измененный массив " + Arrays.toString(shiftArray(stringArray,1,9)));
        //Применим метод для массива Object
        System.out.println("Исходный массив " + Arrays.toString(appleArray));
        System.out.println("Измененный массив " + Arrays.toString(shiftArray(appleArray,0,1)));

        //Сконвертируем массив в List
        //Применим метод для массива Integer
        System.out.println("Исходный массив " + Arrays.toString(integerArray));
        System.out.println("Массив переделанный в List " + convertArray(integerArray));
        //Применим метод для массива String
        System.out.println("Исходный массив " + Arrays.toString(integerArray));
        System.out.println("Массив переделанный в List " + convertArray(stringArray));
        //Применим метод для массива Object
        System.out.println("Исходный массив " + Arrays.toString(integerArray));
        System.out.println("Массив переделанный в List " + convertArray(appleArray));

        //Работа с коробками и фруктами
        FruitBox<Apple> appleFruitBox1 = new FruitBox(new Apple(),10);
        FruitBox<Apple> appleFruitBox2 = new FruitBox(new Apple(),10);
        FruitBox<Orange> orangeFruitBox1 = new FruitBox(new Orange(),9);
        FruitBox<Orange> orangeFruitBox2 = new FruitBox(new Orange(),12);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Вес коробки appleFruitBox1 " + appleFruitBox1.getWeight());
        System.out.println("Вес коробки appleFruitBox2 " + appleFruitBox2.getWeight());
        System.out.println("Вес коробки orangeFruitBox1 " + orangeFruitBox1.getWeight());
        System.out.println("Вес коробки orangeFruitBox2 " + orangeFruitBox2.getWeight());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Сравнение коробок appleFruitBox1 и appleFruitBox2 " + appleFruitBox1.compare(appleFruitBox2));
        System.out.println("Сравнение коробок appleFruitBox2 и appleFruitBox1 " + appleFruitBox2.compare(appleFruitBox1));
        System.out.println("Сравнение коробок orangeFruitBox1 и orangeFruitBox2 " + orangeFruitBox1.compare(orangeFruitBox2));
        System.out.println("Сравнение коробок orangeFruitBox2 и orangeFruitBox1 " + orangeFruitBox2.compare(orangeFruitBox1));
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Пересываем фрукты из коробки appleFruitBox1 в appleFruitBox2");
        appleFruitBox1.shift(appleFruitBox2);
        System.out.println("Вес коробки appleFruitBox1 " + appleFruitBox1.getWeight());
        System.out.println("Вес коробки appleFruitBox2 " + appleFruitBox2.getWeight());
        System.out.println("Пересываем фрукты из коробки appleFruitBox2 в appleFruitBox1");
        appleFruitBox2.shift(appleFruitBox1);
        System.out.println("Вес коробки appleFruitBox1 " + appleFruitBox1.getWeight());
        System.out.println("Вес коробки appleFruitBox2 " + appleFruitBox2.getWeight());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Пересываем фрукты из коробки orangeFruitBox1 в orangeFruitBox2");
        orangeFruitBox1.shift(orangeFruitBox2);
        System.out.println("Вес коробки orangeFruitBox1 " + orangeFruitBox1.getWeight());
        System.out.println("Вес коробки orangeFruitBox2 " + orangeFruitBox2.getWeight());
        System.out.println("Пересываем фрукты из коробки orangeFruitBox2 в orangeFruitBox1");
        orangeFruitBox2.shift(orangeFruitBox1);
        System.out.println("Вес коробки orangeFruitBox1 " + orangeFruitBox1.getWeight());
        System.out.println("Вес коробки orangeFruitBox2 " + orangeFruitBox2.getWeight());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Пересываем часть фруктов из коробки orangeFruitBox1 в orangeFruitBox2");
        appleFruitBox1.shift(appleFruitBox2,3);
        System.out.println("Вес коробки orangeFruitBox1 " + appleFruitBox1.getWeight());
        System.out.println("Вес коробки orangeFruitBox2 " + appleFruitBox2.getWeight());
        System.out.println("Пересываем фрукты из коробки orangeFruitBox2 в orangeFruitBox1");
        appleFruitBox2.shift(appleFruitBox1,2);
        System.out.println("Вес коробки orangeFruitBox1 " + appleFruitBox1.getWeight());
        System.out.println("Вес коробки orangeFruitBox2 " + appleFruitBox2.getWeight());
        System.out.println("------------------------------------------------------------------------");
        appleFruitBox2.shift(appleFruitBox2,2);
    }
}
