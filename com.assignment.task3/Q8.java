import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        int smallest= 999999;
        int val;
        int i = 0;
        while(i != -1){
            System.out.print("Enter number: ");
            val = sc.nextInt();
            if(val > largest){
                largest = val;
            }
            if (val < smallest){
                smallest = val;
            }
            System.out.println("Press -1 to exit or anyother number to continue; ");
            i = sc.nextInt();

        }
        System.out.println("Largest number is: "+ largest);
        System.out.println("Smallest number is: "+ smallest);

    }
    
}
