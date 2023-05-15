import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        int val;
        int num1,num2,ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        num1 = sc.nextInt();
        System.out.println("Enter second number :");
        num2 = sc.nextInt();
        System.out.println("Enter 1:Addition 2. Substraction 3.Multiplication 4.division");
        val = sc.nextInt();
        switch(val){
            case 1:
                ans = num1 + num2;
                System.out.println("Addition of two numbers is "+ ans);
                break;
            case 2:
                ans = num1 - num2;
                System.out.println("Subtraction of two numbers is "+ ans);
                break;
            case 3:
                ans = num1*num2;
                System.out.println("Multiplication of two numbers is "+ ans);
                break;

            case 4:
                ans = num1/num2;
                System.out.println("Division of two numbers is "+ ans);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
    
}
