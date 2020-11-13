import java.util.Scanner;
public class Invert {
    public static void main(String[] args) {
        System.out.println("Fill in the numbers");
        int[] num=new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = in.nextInt();
        }
        int[] r=new int[5];
        for(int i=0;i<num.length;i++){
            r[i]=num[i]*-1;
            System.out.println(r[i]);
        }

    }
}
