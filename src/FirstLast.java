import java.util.Scanner;
/* Given a string, remove the first and the last characters */
public class FirstLast {
    public static void main(String[] args) {
        System.out.println("Type the string");
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String ls = str.substring(1, str.length() - 1);
        System.out.print(ls);
    }
}
