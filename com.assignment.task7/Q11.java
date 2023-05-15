import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sum: ");
        int sum = sc.nextInt();
        boolean flag = false;
        for(int i=0; i< arr1.length;i++){
            int ans = arr1[i];
            for(int j = i+1; j< arr1.length; j++){
                ans = ans+arr1[j];
                if(ans == sum){
                    flag = true;
                    System.out.println("subarray is from index "+ i + " to "+ j);
                }

            }
            
        }
        if(flag == false){
            System.out.println("No subarray found");
        }
    }
    
}
