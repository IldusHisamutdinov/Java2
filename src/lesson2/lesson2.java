package lesson2;



public class lesson2 {

    private static final int SIZE = 4;
    private static String[][] mas1 = { //массив 4х4
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };
    private static String[][] mas2 = { //массив без одного элемента
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "66"},
            {"14", "15", "16"}
    };
    private static String[][] mas3 = { //массив с " " элементом
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", " "}
    };
    private static String[][] mas4 = { //массив 5х5
            {"1", "2", "3", "4", "45"},
            {"5", "6", "7", "8", "46"},
            {"9", "10", "11", "12", "47"},
            {"13", "14", "15", "16", "48"},
            {"17", "18", "19", "20", "21"}
    };

    public static void main(String args[]) {

        callСount(mas1);
        callСount(mas2);
        callСount(mas3);
        callСount(mas4);
    }

    // вывод в печать сумма элементов массива
    private static void callСount(String mas[][]) {
        //ловим исключения "не размер" или "не число"
        try {
            int sum = sumElements(mas);
            System.out.println("Сумма элементов массива " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("");
        }
    }

    // сложение элементов массива
    private static int sumElements(String[][] mas) {
        checkArraySize(mas); //проверяем размер массива, если соответствует SIZE, то идем дальше

        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                String value;
                value = mas[i][j]; //задаем переменную, если "не число" и выводим в исключение
                // ловим не число
                try {
                    sum = sum + Integer.parseInt(mas[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(value, i, j);
                }
            }
        }
        return sum;
    }

    // проверяем размер массива на SIZE циклом foreach
    private static void checkArraySize(String[][] mas) throws MyArraySizeException {

//замечание преподавателя: также стоит проверить размер самого массива, 
//иначе массив n x 4 будет рабочим вариантом
        if(mas.length != SIZE){
			throw new MyArraySizeException();
		}
			
        for (String[] w : mas) {
            if (w.length != SIZE) {
                throw new MyArraySizeException();
            }
        }

    }
}
