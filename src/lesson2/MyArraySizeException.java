package lesson2;


public class MyArraySizeException extends IllegalArgumentException {

    public MyArraySizeException() {
        System.out.println("Размер массива не 4х4");
    }
}
