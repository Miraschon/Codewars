import java.util.Scanner;

public class BalancedNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = in.nextInt();
        int length = String.valueOf(x).length();


        if(length%2==0){
            System.out.println("even");
        }else if(length==1) {
            System.out.println("Balanced");
        }else
            {
                System.out.println("odd");
            }
        }
    }

