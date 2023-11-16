package de.schlueter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] array = { 1, 2, 3 };
        Arrays arrays = new Arrays(array);
        arrays.print();
        arrays.setByIndex(1, 5);
        arrays.print();
    }
}
