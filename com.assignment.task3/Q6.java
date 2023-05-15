import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int ans;
        int n = 0;
        do{
            System.out.print("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc.nextInt();
            ans = num1 + num2;
            System.out.println("Sum is: "+ " "+ ans);
            System.out.println("Press -1 to exit else press anyother number");
            n = sc.nextInt();

        }while(n != -1);
    }
    
}
