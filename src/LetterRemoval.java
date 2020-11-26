import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;
/* NOT DONE. Given a lower case string and your task will be to remove k characters from that string using the following rule:

- first remove all letter 'a', followed by letter 'b', then 'c', etc...
- remove the leftmost character first. */

public class LetterRemoval {
    public static void main(String[] args) {
        System.out.println("Type a sentence");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        System.out.println("Enter k");
        int k= in.nextInt();
        char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i=0; i<ch.length; i++){
            for(int j=0; j<k; k++){
                if(ch[i]==a[j]){
                    ch = ArrayUtils.remove(ch, i);
                }
            }
        }
        System.out.print(ch);

    }
}
