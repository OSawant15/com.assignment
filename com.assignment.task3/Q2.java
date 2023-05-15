import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        val = sc.nextInt();
        int ans = 1;
        for (int i = val; i > 0; --i){
            ans = ans*i;
        }
        System.out.println("Factorial is"+" "+ ans);
        
    }
    
}
