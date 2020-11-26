import java.util.Scanner;
/* Given a string, remove all spaces*/
public class Spaceless {

    public static void main(String[] args) {
        System.out.println("Type a sentence");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s+", "");
        System.out.println("String- " + s);

    }
}
