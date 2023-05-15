import java.util.Arrays;
public class Q10 {
    public static void main(String[] args) {
        int arr1[] = {10,20,30,40};
        int arr2[] = {10,20,30,40};
        boolean ans = Arrays.equals(arr1,arr2);
        if(ans == true){
            System.out.println("The two arrays are equal");
        }
        else{
            System.out.println("The two arrays are not equal");
        }
    }
    
}
