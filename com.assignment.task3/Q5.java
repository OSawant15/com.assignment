import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        val = sc.nextInt();
        int n = 0;
        int temp = 0;
        int ans = 0;
        while (n < val) {
            ans = ans + temp;
            temp = temp + 2;
            n = n + 1;
        }
        System.out.println("Sum is: " + ans);
    }
}