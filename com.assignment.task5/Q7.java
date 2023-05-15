import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Set<Character> h = new HashSet<Character>();
        String str1 = "Consultad";
        int n1 = str1.length();
        int n2;
        for(int i =0; i < str1.length();++i){
            h.add(str1.charAt(i));
        }
        n2 = h.size();
        if(n1 == n2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
    
}
//The second part is same as Question2 of task 4.