import java.io.CharArrayReader;

public class Q3 {
    public static void main(String[] args) {
        String s1 = "Omkarsawant";
        boolean flag = false;
        for(int i=0; i< s1.length(); i++){
            if(s1.indexOf(s1.charAt(i), s1.indexOf(s1.charAt(i))+ 1) != -1){
                flag = true;
                System.out.println("The the string does not have unique characters");
                break;
            }
        }
        if(flag == false){
            System.out.println("The string is has unique characters");
        }
    }
    
}
