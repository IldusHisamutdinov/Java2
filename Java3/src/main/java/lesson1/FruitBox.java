package lesson1;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
    private List<T> box = null;

    //Конструктор коробки
    public FruitBox(T fruit, int count) {
        this.box = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            T fruitType = (T) new Fruit();
            box.add(fruitType);
        }
    }

    //Метод получения веса коробки
    public double getWeight() {
        return (box.size() != 0) ? box.get(0).getWeight() * box.size() : 0.0;
    }

    //Метод сравнения коробок
    public boolean compare(FruitBox<T> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    //Метод перекладывает фрукты из
    //себя в поданную на вход коробку полностью
    public void shift(FruitBox<T> dest) {
        if (!dest.equals(this)) {
            dest.box.addAll(this.box);
            this.box.clear();
        } else {
            System.out.println("Не нужно пересыпать из себя в себя");
        }
    }

    //Метод перекладывает фрукты из
    //себя в поданную на вход коробку определенное количество фруктов
    public void shift(FruitBox<T> dest, int count) {
        if (!dest.equals(this)) {
            if (count <= box.size()) {
                for (int i = 0; i < count; i++) {
                    dest.put(box.get(i));
                    box.remove(i);
                }
            } else {
                System.out.println("В коробке только " + box.size() + " фруктов");
            }
        } else {
            System.out.println("Не нужно пересыпать из себя в себя");
        }
    }

    //Метод добавления фрукта в коробку
    public void put(T fruit) {
        this.box.add(fruit);
    }
}
