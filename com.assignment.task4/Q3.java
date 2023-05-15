import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40};
        System.out.println("Enter the number to check if present in array: ");
        int val = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;++i){
            if(val == arr[i]){
                System.out.println("Number found");
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Number not found");
        }
    }
    
}
