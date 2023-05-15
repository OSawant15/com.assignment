import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        double avg=0;
        for(int i=0;i<arr.length;++i){
            avg = avg +arr[i];
        }
        System.out.println("Average is: "+ avg/arr.length);
    }
    
}
