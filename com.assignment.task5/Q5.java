public class Q5 {
    public static void main(String[] args) {
        String str1 = "Omkarsawant";
        char[] temp = {'a','e','i','o','u','A','E','I','O','U'};
        int vowel =0;
        int consonant = 0;
        for(int i=0; i<str1.length(); ++i){
            boolean flag = false;
            for(int j=0; j< temp.length; ++j){
                if(str1.charAt(i) == temp[j]){
                    ++vowel;
                    flag = true;
                }
            }
            if (flag == false){
                ++consonant;
            }
        }
        System.out.println("Vowels: "+ vowel);
        System.out.println("Consonant: "+ consonant);
    }
    
}
