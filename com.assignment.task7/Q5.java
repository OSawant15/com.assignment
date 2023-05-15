import java.lang.Math;

public class Q5 {
    public static void main(String[] args) {
        int a = 123;
        int len = String.valueOf(a).length();
        String s1 = String.valueOf(a);
        double ans =0;

        for(int i=0; i<s1.length(); i++){
            int temp = Character.getNumericValue(s1.charAt(i));
            ans = ans + Math.pow(temp,len);
        }
        int ans1 = (int)ans;
        if(a == ans1){
            System.out.println("The number is armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");
        }

        

    }
    
}
