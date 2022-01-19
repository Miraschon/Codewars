import java.util.Scanner;
/*
Your car is old, it breaks easily. The shock absorbers are gone and you think it can handle about 15 more bumps before it dies totally.

Unfortunately for you, your drive is very bumpy! Given a string showing either flat road ("_") or bumps ("n"), work out if you make it home safely. 15 bumps or under, return "Woohoo!", over 15 bumps return "Car Dead".

 */
public class BumpyRoad {
    public static void main(String args[]) {
        System.out.println("Show me what the road looks like");
        Scanner sc = new Scanner(System.in);
        String road = sc.nextLine();
        char bumps = 'n';
        int count = 0;

        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i) == bumps) {
                count++;
            }
        }
        if(count<15){
            System.out.println("Woohoo!");
        }else{
            System.out.println("Car Dead");
        }

    }
    }
