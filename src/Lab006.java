import java.util.Scanner;

/**
 * @author Raymond Valdez
 * Date: March 3rd, 2023
 *
 * The Lab006 Class takes 2 integers and uses Lab006 method and isDivisible method to check
 * if the 2 integers are evenly divisible by one another
 *
 */
public class Lab006 {
    private int n;
    private int m;

    /**
     *
     * Constructs a Lab006 object with given integer values
     *
     * @param n is an integer value that a user will enter
     * @param m is an integer value that a user will enter
     *
     */
    public Lab006(int n, int m) {
    this.n = n;
    this.m = m;
    }

    /**
     *
     * Method isDivisible checks if n is evenly divisible by m
     *
     * @return true if n is divisible by m
     * @return false if not divisible by m
     *
     * */

    public boolean isDivisible() {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The main method will first ask for user input for int value n and then the same for int value m.
     * It will then create a new Lab006 object with the values n and m used as parameters.
     * Then it will call method is divisible to check if its evenly divisible and then print out the results.
     * @param args is not used
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a value for n: ");
        int n = scan.nextInt();

        System.out.println("Enter a value for m: ");
        int m = scan.nextInt();

        Lab006 lab = new Lab006(n,m);

        boolean divide = lab.isDivisible();

        if (divide) {
            System.out.println(n + " is evenly divisible by " + m);
        } else {
            System.out.println(n + " is not evenly divisible by " + m);
        }
    }
}

