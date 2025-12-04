
/**
 * Write a description of class III here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Three {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}