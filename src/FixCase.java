import java.util.Scanner;
/*given a string that may have mixed uppercase and lowercase letters, convert that string to either lowercase only or uppercase:
    make as few changes as possible.
    if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
 */
public class FixCase {
    public static void main(String[] args) {
        System.out.println("Type a sentence");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int uc = 0;
        int lc = 0;
        char[] ch = new char[s.length()];
        for (int i = 0, len = s.length(); i < len; i++) {
            ch[i] = s.charAt(i);
            if (Character.isUpperCase(ch[i])) {
                uc++;
            } else if (Character.isLowerCase(ch[i])) {
                lc++;
            }
        }
        if (uc > lc) {
            for (int i = 0; i < ch.length; i++) {
                if (Character.isLowerCase(ch[i])) {
                    ch[i] = Character.toUpperCase(ch[i]);
                }
            }
        } else {
            for (int i = 0; i < ch.length; i++) {
                if (Character.isUpperCase(ch[i])) {
                    ch[i] = Character.toLowerCase(ch[i]);
                }
            }
        }
        System.out.print(String.valueOf(ch));

    }
}
