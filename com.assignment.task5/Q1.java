public class Q1 {
    public static void main(String[] args) {
        String val1 = "Consultadd";
        String temp = "";
        char t;
        for(int i=0; i<val1.length(); ++i){
            t = val1.charAt(i);
            temp = t + temp;
        }
        System.out.println("Reverse: "+ temp);
    }
    
}
