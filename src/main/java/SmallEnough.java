
import java.util.Scanner;
/*given an array and a limit value check that all values in the array are below or equal to the limit value.
 If they are, return true. Else, return false.*/
public class SmallEnough {
    public static void main(String[] args) {
        System.out.println("fill in the numbers");
        int[] num = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        System.out.println("Enter the limit");
        int limit=in.nextInt();
        check(num,limit);

    }
    public static boolean check(int arr[], int limit){
        boolean result=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<limit || arr[i]==limit ){
                result= true;
            }else{
                result= false;
            }
        }
        System.out.println(result);
        return result;
    }

}
