import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        int val;
        double tax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary :");
        val = sc.nextInt();
        if (val > 1200000){
            tax = val *0.25;
            System.out.println("Tax paid is "+tax);
        }
        else if(val > 600000){
            tax = val *0.18;
            System.out.println("Tax paid is "+tax);
        }
        else if(val > 250000){
            tax = val * 0.10;
            System.out.println("Tax paid is "+tax);
        }
        else{
            System.out.println("Invalid salary");
        }


    }
    
}
