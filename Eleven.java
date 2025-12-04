
/**
 * Write a description of class I here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Eleven{
    public static void main(String[] args) {

        int[] arr = { 10, 15, 20, 25, 30, 35, 40 };

        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Elements at even indices: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}