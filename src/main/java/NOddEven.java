import java.util.Scanner;
/* Given a list of numbers, determine whether the sum of its elements is odd or even. */
public class NOddEven {
    public static void main(String[] args) {
        System.out.println("Fill in the numbers");
        int[] num=new int[3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i] = in.nextInt();
        }
        int r=0;
        for(int i=0; i<num.length; i++){
            r+=num[i];
        }
        if(r%2==0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }


    }
}
