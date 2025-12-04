
/**
 * Write a description of class I2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Twenty{
    public static void main(String[] args) {

        int[] numbers = { 10, 25, 30, 15, 40, 18, 50 };

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers greater than 20: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 20 && numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}