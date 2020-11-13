import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0){
            System.out.print(n*8);
        }else{
            System.out.print(n*9);
        }
    }
}
