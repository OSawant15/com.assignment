import java.util.Arrays;
public class Q3 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        boolean flag = false;
        for(int i=0; i<char1.length; ++i){
            if(char1[i] != char2[i]){
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("The two strings are anagrams");
        }
        else{
            System.out.println("The two strings are not anagrams");
        }
        
    }
    
}
