import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n>0){
            System.out.print(n*-1);
        }else{
            System.out.print(n);
        }
    }
}
