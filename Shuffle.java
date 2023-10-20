import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Swap(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void Swap(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
