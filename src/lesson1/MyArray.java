package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray<T> {
    private T[] array;

    @SafeVarargs
    public MyArray(T... array) {
        this.array = array;
    }

    public T[] swapElements(int index1, int index2) {
            T temp = array[index2];
            array[index2] = array[index1];
            array[index1] = temp;
        return array;
    }

    public List<T> converseArrayToList() {
        return new ArrayList<>(Arrays.asList(array));

    }
}
