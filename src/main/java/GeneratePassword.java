import java.util.Scanner;
/*One suggestion to build a satisfactory password is to start with a memorable phrase or sentence and make a password by extracting the first letter of each word.

Even better is to replace some of those letters with numbers (e.g., the letter O can be replaced with the number 0):

    instead of including i or I put the number 1 in the password;
    instead of including o or O put the number 0 in the password;
    instead of including s or S put the number 5 in the password.
 */
public class GeneratePassword {
    public static void main(String[] args) {
        System.out.println("Type a sentence");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        char[] result = new char[arr.length];

        for(int i=0;i<result.length;i++){
            if(arr[i].charAt(0)=='i' || arr[i].charAt(0)=='I' ){
                result[i] = '1';
            }else if(arr[i].charAt(0)=='s' || arr[i].charAt(0)=='S'){
                result[i] = '5';
            }else if(arr[i].charAt(0)=='o' || arr[i].charAt(0)=='O'){
                result[i] = '0';
            }else{
                result[i] = arr[i].charAt(0);
            }

           System.out.print(result[i]);
        }

    }
}
