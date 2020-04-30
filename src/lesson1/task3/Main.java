package lesson1.task3;

import lesson1.task3.fruits.Apple;
import lesson1.task3.fruits.Orange;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<>(apple1, apple3);
        Box<Orange> box2 = new Box<>(orange1, orange2);
        box1.addFruit(apple2);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>();
        box2.putInOtherBox(box3);

    }
}
