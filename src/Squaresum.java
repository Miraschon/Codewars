import java.util.Scanner;

public class Squaresum {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        int[] num=new int[3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = in.nextInt();
        }
        int[] numsq=new int[3];
        int sum=0;
        for(int i=0;i<num.length;i++){
            numsq[i]=num[i]*num[i];
            sum=sum+numsq[i];
        }
        System.out.print(sum);
    }
}
