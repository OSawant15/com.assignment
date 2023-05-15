public class Q8 {
    public static void main(String[] args) {
        int arr[] = {1, 16, 2, 19, 10, 20};
        int first = -1;
        int second = -1;
        int third = -1;

        for(int i=0; i<arr.length; ++i){
            if (arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second){
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third){
                third = arr[i];
            }

        }
        System.out.println("Third largest is: "+ third);

    }
    
}
