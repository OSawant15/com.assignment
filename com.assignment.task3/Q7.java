import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val;
        System.out.print("enter the number: ");
        val = sc.nextInt();
        int i,j;
        for(i=0; i<val; i++){
            for(j=2*(val-i); j >= 0; j--){
                System.out.print(" ");
            }
            for(j=0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        

    }
    
}
