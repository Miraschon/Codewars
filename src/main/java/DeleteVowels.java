import java.util.Scanner;
/*In the given string, consisting of uppercase and lowercase Latin letters, it:

    deletes all the vowels,
    inserts a character "." before each consonant,
    replaces all uppercase consonants with corresponding lowercase ones.
*/
public class DeleteVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s = sc.nextLine();
        String ns = s.replaceAll("[AEIOUaeiou]", "");
        char[] ch = new char[ns.length()];
        for(int i=0;i<ch.length;i++){
            ch[i]=ns.charAt(i);
        }
        for(int i=0;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                ch[i]=Character.toLowerCase(ch[i]);
            }
        }
        ns=String.valueOf(ch);
        for(int i=0;i<ch.length;i++){
            ns=ns+"."+ch[i];
        }


        /*int r=ns.length()*2;
        char[] ch = new char[r];
        for (int i = 0; i < r;) {
            ch[i] ='.';
            ch[i+1]=ns.charAt(i);
            i+=2;
        }*/


    }
}
