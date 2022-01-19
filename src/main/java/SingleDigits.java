import java.util.Scanner;
/*NOT DONE
reduce the passed integer to a single digit (if not already) by converting the number to binary,
 taking the sum of the binary digits, and if that sum is not a single digit then repeat the process. */
public class SingleDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X");
        int x = in.nextInt();
        String binary = Integer.toBinaryString(x);
        x=Integer.parseInt(binary);

        /*int sum=0;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }*/
        System.out.println(binary);
    }
}
