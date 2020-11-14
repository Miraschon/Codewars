import java.util.Scanner;

public class AlterCapitalization {
    public static void main(String[] args) {
        System.out.println("Type a sentence");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = new char[s.length()];
        for (int i = 0, len = s.length(); i < len; i++) {
            ch[i] = s.charAt(i);
            if(ch[i]%2==0){
                ch[i]=(Character.toUpperCase(ch[i]));
            }
        }
        System.out.print(String.valueOf(ch)+", ");
        for (int i = 0, len = s.length(); i < len; i++) {
            ch[i] = s.charAt(i);
            if(ch[i]%2!=0){
                ch[i]=(Character.toUpperCase(ch[i]));
            }
        }
        System.out.print(String.valueOf(ch));
    }
}
