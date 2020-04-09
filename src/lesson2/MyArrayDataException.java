package lesson2;


public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String value, int i, int j) {
        System.out.printf("Неверное значение '%s'. Место в массиве [%d][%d]", value, i, j);
    }
}
