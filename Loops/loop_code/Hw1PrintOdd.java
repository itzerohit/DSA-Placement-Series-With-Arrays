
package Loops;
import java.util.Scanner;
// We are goin to print all the odd number between one to 100

public class Hw1PrintOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i=i+2){
            System.out.println(i);
        }
    }
}
