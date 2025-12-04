
/**
 * Write a description of class II here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Two {
    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 7, 5, 6, 7, 8, 9, 7};

        int target = 7;

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nTarget: " + target);

        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("The number " + target + " appears " + count + " times.");
    }
}