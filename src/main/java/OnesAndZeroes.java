/*
Given an array of ones and zeroes, convert the equivalent binary value to an integer.

Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 */
import java.util.Scanner;

public class OnesAndZeroes {
    public static void main(String args[]){
        int arr[]=new int[4];
        System.out.println("Fill in the numbers");
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
            StringBuilder binaryString= new StringBuilder();
        for(int i=0;i< arr.length;i++){
            binaryString.append(arr[i]);
        }
           int decimal=Integer.parseInt(binaryString.toString(),2);
            System.out.println(decimal);
        }}

