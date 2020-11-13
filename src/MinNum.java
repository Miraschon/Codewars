import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        System.out.println("Fill in the numbers");
        int[] num=new int[10];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = in.nextInt();
        }
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i] <min)
                min = num[i];
        }
        System.out.print(min);
    }
}
