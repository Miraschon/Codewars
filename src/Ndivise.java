import java.util.Scanner;

public class Ndivise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X");
        int x = in.nextInt();
        System.out.println("Enter Y");
        int y = in.nextInt();
        System.out.println("Enter N");
        int n = in.nextInt();
        if(n%x==0 && n%y==0){
            System.out.print("true");
        }else{
            System.out.print("false");
        }

    }
}
