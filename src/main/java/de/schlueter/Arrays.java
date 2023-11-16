package de.schlueter;

public class Arrays {

    private int[] array;
    
    public Arrays(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int getByIndex(int index) {
        return array[index];
    }

    public void setByIndex(int index, int value) {
        array[index] = value;
    }

    public int getLength() {
        return array.length;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

}
