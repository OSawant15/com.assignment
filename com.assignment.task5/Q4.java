public class Q4 {
    public static void main(String[] args) {
        String str1 = "Omkarsawant";
        char temp = 'a';
        int count = 0;
        for(int i=0; i<str1.length();++i){
            if(str1.charAt(i) == temp){
                ++count;
            }
        }
        System.out.println("total occurences of"+" " + temp + " is "+count);
    }
    
}
