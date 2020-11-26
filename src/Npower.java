import java.util.Scanner;
/*Given an array with positive numbers and a number N, find the N-th power of the element in the array with the index N. */
public class Npower {
    public static void main(String[] args) {
        System.out.println("Fill in the numbers");
        int[] num=new int[10];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = in.nextInt();
        }

        System.out.println("Enter N");
        int n = in.nextInt();
        System.out.print( (int) Math.pow(num[n], n));
    }
}
