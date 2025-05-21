package Task5;


public class Example {
    public static int[] reverse(int[] array) {
        int length = array.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[length-i-1] = array[i];
        }

        return reversed;
    }
}