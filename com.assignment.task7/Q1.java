public class Q1 {
    public static void main(String[] args) {
        String s1 = "Consultadd";
        boolean flag = false;
        for(int i=0;i<s1.length();i++){
            if(s1.indexOf(s1.charAt(i), s1.indexOf(s1.charAt(i)) +1) == -1){
                flag = true;
                System.out.println("Frist occurence is:"+ s1.charAt(i));
                break;
            }
        }
        if(flag == false){
            System.out.println("No nonrepeating character");
        }
    }
    
}
