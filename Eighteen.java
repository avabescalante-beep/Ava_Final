
/**
 * Write a description of class I0 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Eighteen{
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 5, 3, 8};
        boolean hasDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate) break;
        }

        if (hasDuplicate) System.out.println("The array contains duplicate values.");
        else System.out.println("The array does not contain duplicate values.");
    }
}
