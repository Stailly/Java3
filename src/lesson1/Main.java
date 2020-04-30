package lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArray<String> array = new MyArray<>("ujnj", "bhbkj", "bknbub");
        System.out.println(array.converseArrayToList());

        MyArray<Integer> arr = new MyArray<>(6, 7, 9, 12, 54, 17);
        System.out.println(Arrays.toString(arr.swapElements(0, 3)));
    }
}