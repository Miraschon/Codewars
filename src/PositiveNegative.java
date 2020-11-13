import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        System.out.println("Fill in the numbers");
        int[] num=new int[10];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = in.nextInt();
        }
        int p=0;
        int n=0;
        for(int i=0;i<num.length;i++){
            if(num[i]<0){
                n=n+num[i];
            }else{
                p=p+num[i];
            }
        }
        System.out.println(p);
        System.out.println(n);


    }
}
