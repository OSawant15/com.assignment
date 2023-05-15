public class Q8 {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40};
        int max = 0;
        for(int i=0; i< arr1.length; i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println("The maximum is:" + max);
    
    }
    
}
