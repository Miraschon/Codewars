import java.util.Scanner;
/* Given an array, find the sum of all the positive numbers in it*/
public class PositiveSum {
    public static void main(String[] args) {
        System.out.println("Fill in the numbers");
        int[] num=new int[4];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = in.nextInt();
        }
        int sum=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>0){
                sum=sum+num[i];
            }
        }
        System.out.print(sum);

    }
}
