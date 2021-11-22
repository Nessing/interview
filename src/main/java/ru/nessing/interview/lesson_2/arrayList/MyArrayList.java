package ru.nessing.interview.lesson_2.arrayList;

public class MyArrayList<T> {

    private Object[] array;

    public MyArrayList() {
        this.array = new Object[]{};
    }

    public void insert(T element) {
        Object[] temp = new Object[array.length + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
        array[array.length - 1] = element;
    }

    public void delete() {
        Object[] temp = new Object[array.length - 1];
        System.arraycopy(array, 0, temp, 0, array.length - 1);
        array = temp;
    }

    public void update(int index, int element) {
        array[index] = element;
    }

    public Object get(int index) {
        return array[index];
    }

    public void display() {
        for (Object i : array) {
            System.out.println(i);
        }
    }
}
