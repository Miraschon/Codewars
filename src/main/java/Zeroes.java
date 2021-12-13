import java.util.Scanner;
/* Given an array of numbers, return the number of zeroes*/
public class Zeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N");
        int n = in.nextInt();
        int z=0;

        int[] num=new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=i+1;
        }
        for(int i=1; i<num.length; i++){
           z+=getZeroes(num[i]);
        }
        System.out.print(z);


    }
    public static int getZeroes(int x){
        int count=0;
        while(true){
            if(x%10==0){
                count++;
            }
            x=x/10;
            if(x==0){
                return count;
            }
        }
    }
}
