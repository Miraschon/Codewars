import java.util.Scanner;

public class TriangularNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N");
        int n = in.nextInt();
        if (n>0 || n==0){
            System.out.print(n*(n + 1)/2);
        }else{
            System.out.print(0);
        }

    }
}
