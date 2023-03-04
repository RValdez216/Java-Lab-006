import java.util.Scanner;

public class Main {

    public static void main(System[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a value for n: ");
        int n = scan.nextInt();

        System.out.println("Enter a value for m: ");
        int m = scan.nextInt();

        Lab006 lab = new Lab006(n,m);

        boolean divide = lab.isDivisible();

        if (divide) {
            System.out.println(n + "is evenly divisible by " + m);
        } else {
            System.out.println(n + "is not evenly divisible by " + m);
        }
    }

}
