import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        double val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Percentage:");
        val = sc.nextDouble();
        if(val > 90){
            System.out.println("Grade is A");
        }
        else if(val > 75){
            System.out.println("Grade is B");
        }
        else if(val > 65){
            System.out.println("Grade is C");
        }
        else{
            System.out.println("Invalid");
        }

    }
}
