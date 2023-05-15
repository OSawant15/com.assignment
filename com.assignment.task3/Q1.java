import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int val1 = 0;
        int val2 = 1;
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        val = sc.nextInt();
        val = val -2;
        int ans =0;
        System.out.print(val1 + " ");
        System.out.print(val2 + " ");
        for (int i=0; i < val;++i){
            ans = val1 + val2;
            val1 = val2;
            val2 = ans;
            System.out.print(ans + " ");
        }
    }
    
}
