import java.util.HashMap;

public class Q6 {
    public static void main(String[] args) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        String s1 = "OOmkarsawant";
        for(int i=0; i<s1.length(); i++){
            if(h1.containsKey(s1.charAt(i))){
                h1.put(s1.charAt(i), h1.get(s1.charAt(i)) + 1);
            }
            else{
                h1.put(s1.charAt(i), 1);
            }
        }
        System.out.println("The count of each character is:"+ h1);

    }
    
}
