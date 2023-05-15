import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        int sum = 0;
        int temp;
        System.out.print("enter number: ");
        int n = sc.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("number is palindrome  ");
        else
            System.out.println("number is not palindrome");
    }
}
