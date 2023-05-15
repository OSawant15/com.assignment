import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        val = sc.nextInt();
        while(true){
            if(val >= 0){
                System.out.println("Good going");
                System.out.print("Enter number :");
                val = sc.nextInt();
                continue;
            }
            else{
                System.out.println("Its over");
                break;
            }
        }
    }
    
}
