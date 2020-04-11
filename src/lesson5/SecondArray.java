package lesson5;

import java.util.Arrays;

public class SecondArray {
    static final int size = 10000000;
    static final int h = size / 2;
    long timeStart = 0;      // старт времени
    long timeDuration = 0;   // время выполнения
    long tmpTimeStamp = 0;   // промежуточная метка времени
    float[] floatArr = new float[size];
    float[] arr1 = new float[h];  // разделенный массив "1"
    float[] arr2 = new float[h];  // разделенный массив "2"

    public void startArr() {
        Arrays.fill(floatArr, 1);
        timeStart = System.currentTimeMillis();
        tmpTimeStamp = System.currentTimeMillis();
        // деление массива на 2
        System.arraycopy(floatArr, 0, arr1, 0, h);
        System.arraycopy(floatArr, h, arr2, 0, h);
        System.out.println("Время разделения массива : " + (System.currentTimeMillis() - tmpTimeStamp));

        tmpTimeStamp = System.currentTimeMillis();
        Thread first = new Thread(() -> {
            this.arrayCouinting(arr1, 0);
        });
        Thread second = new Thread(() -> {
            this.arrayCouinting(arr2, h);
        });
        first.start();
        second.start();
        try {
            first.join();
            second.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Время вычисления в массивах " + (System.currentTimeMillis() - tmpTimeStamp));
        // соединяем массивы в один
        tmpTimeStamp = System.currentTimeMillis();
        System.arraycopy(arr1, 0, floatArr, 0, h);
        System.arraycopy(arr2, 0, floatArr, h, h);
        System.out.println("Время соединения массивов: "+ (System.currentTimeMillis() - tmpTimeStamp));

        timeDuration = System.currentTimeMillis() - timeStart;
        System.out.println("Длительность вычисления с разделением массива " + timeDuration);

    }

    private float[] arrayCouinting(float[] floatArr, int position) {

        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = (float) (floatArr[i] * Math.sin(0.2f + (i + position) / 5) * Math.cos(0.2f + (i + position) / 5) * Math.cos(0.4f + (i + position) / 2));
        }
        return floatArr;
    }

}

