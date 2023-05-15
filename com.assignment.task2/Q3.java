import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        int num1,num2,quo;
        int rem;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        num1 = sc.nextInt();
        System.out.print("Enter second number :");
        num2 = sc.nextInt();
        quo = num1/num2;
        rem = num1 % num2;
        System.out.println("Quotient is :"+ quo);
        System.out.println("Remainder is :"+ rem);



    }
    
}
