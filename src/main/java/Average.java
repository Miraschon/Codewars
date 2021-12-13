import java.util.Scanner;
/*Given a list of numbers, find the average*/
public class Average {
    public static void main(String[] args) {
        System.out.println("fill in the numbers");
        int[] num=new int[10];
        int sum=0;
        int m;
        Scanner in = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = in.nextInt();
        }

        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        m=sum/num.length;
        System.out.print(m);
    }
}
