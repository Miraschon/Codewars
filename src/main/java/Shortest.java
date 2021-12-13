import java.util.Scanner;
/* Given a string, find the length of the shortest word */
public class Shortest {
    public static void main(String[] args) {
        System.out.println("Type a sentence");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("\\s+");
        int[] num=new int[words.length];
        for (int i = 0; i < words.length; i++) {
            num[i] = words[i].length();
        }
        int sw = num[0];
        for (int i = 0; i < words.length; i++) {
            if(sw>num[i]){
                sw=num[i];
            }}
        System.out.println("The length of the shortest word is: "+sw);

    }
}
