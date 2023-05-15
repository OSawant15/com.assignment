import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        int val;
        System.out.println("Enter Elememts: ");
        for (int i=0;i<arr.length;++i){
            val = sc.nextInt();
            arr[i] = val;
        }
        System.out.println("Array Elements: ");
        for(int j =0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    
}
