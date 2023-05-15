public class Q5 {
    public static void main(String[] args) {
        int arr1[][] = {{10,20},{30,40}};
        int arr2[][] = {{1,2},{3,4}};
        int arr3[][] = new int[2][2];
        for(int i=0; i<arr1.length; ++i){
            for(int j=0; j<arr1[0].length; ++j){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int k=0; k<arr3.length;++k){
            for(int m=0; m<arr3[0].length;++m){
                System.out.print(arr3[k][m]+" ");
            }
            System.out.println();
        }

    }
}
