public class Q4 {
    public static void main(String[] args) {
        String sent1 = "Hello how are you?";  
        int count = 0;
        for(int i=0; i<sent1.length();i++){
            if(sent1.charAt(i) == ' '){
                count = count+1;
            }
        }
        count = count+1;
        System.out.println("Total words are:"+count);

    }
    
}
