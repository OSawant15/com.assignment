import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        val = sc.nextInt();
        if (val >= 0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
        

    }
    
}
