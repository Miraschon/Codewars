import java.util.Arrays;
import java.util.Scanner;
/* Given a string, return a list of ints detailing the count of uppercase letters, lowercase, numbers and special characters, as follows.

Solve("*'&ABCDabcde12345") = [4,5,5,3].
--the order is: uppercase letters, lowercase, numbers and special characters.*/
public class HowManyCharacters {
    public static void main(String[] args) {
        System.out.println("Type a sentence");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] ch = new char[s.length()];
        int uc=0, lc=0, sc=0, num=0;
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            if (Character.isUpperCase(ch[i])) {
                uc++;
            } else if (Character.isLowerCase(ch[i])) {
                lc++;
            } else if(Character.isDigit(ch[i])){
                num++;
            }
            else {
                sc++;
            }
        }
        Arrays.asList(uc,lc,num,sc).forEach(System.out::println);


    }
}
