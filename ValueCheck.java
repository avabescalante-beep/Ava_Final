
/**
 * Write a description of class II here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ValueCheck {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 5, 3, 5, 8, 5};
        int target = 5, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) count++;
            if (count >= 3) break;
        }

        if (count >= 3) System.out.println(target + " appears at least 3 times.");
        else System.out.println(target + " appears less than 3 times.");
    }
}

