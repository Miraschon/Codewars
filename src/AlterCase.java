import java.util.Scanner;

public class AlterCase {
    public static void main(String[] args) {
        System.out.println("Type a sentence");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0, len = str.length(); i < len; i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                System.out.print(Character.toLowerCase(ch));
            } else {
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
}
