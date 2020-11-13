import java.util.Scanner;

public class XDivisible {
    public static void main(String[] args) {
        System.out.println("Fill in the numbers");
        int[] num=new int[10];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = in.nextInt();
        }
        System.out.println("Enter X");
        int x = in.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]%x==0){
                System.out.println(num[i]);

            }
        }

    }
}
