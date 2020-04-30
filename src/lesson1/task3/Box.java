package lesson1.task3;

import lesson1.task3.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
        //Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов:
    // нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а
    // в другую перекидываются объекты, которые были в первой;

       private List<T> box;

    @SafeVarargs
    public Box(T ... fruits) {
        this.box = new ArrayList<>(Arrays.asList(fruits));
    }

    public void addFruit(T ... fruits) {
        box.addAll(Arrays.asList(fruits));
    }

    public void putInOtherBox (Box<T> another){
        another.box.addAll(this.box);
        this.box.clear();
    }

    public boolean compare(Box<?> another) {
        return this.getWeight() == another.getWeight();
    }

    public float getWeight() {
        float boxWeight = 0;
        for (T fruit : box) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }
}
