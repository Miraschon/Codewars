import java.util.Scanner;
/*In this kata, we will be using a more complicated sequence: 0, 1, 3, 6, 10, 15, 21, 28, ...
This sequence is generated with the pattern: "the nth term is the sum of numbers from 0 to n, inclusive".
Complete the function that takes an integer n and returns a list/array of length abs(n) + 1 of the arithmetic series explained above.
 When < 0 return the sequence with negative terms.*/
public class Sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N");
        int n = in.nextInt();
        for(int i=1; i<Math.abs(n)+ 1; i++){
            int sum=0;
            for(int j=0;j<i; j++){
                sum+=j;
            }
            if (n < 0) {
                System.out.printf("%d ",sum*-1);
            }else{
                System.out.printf("%d ",sum);
            }

        }
    }

}
