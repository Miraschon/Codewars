import java.util.Scanner;
/* Write a function  that accepts a single argument n and generates an array containing the integers from 0 to n inclusive. */
public class ZeroToN {
    public static void main(String[] args) {
        System.out.println("Enter N");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n+1];
        for(int i=0;i<num.length;i++){
            num[i] = i;
            System.out.println(num[i]);
        }

    }
}
