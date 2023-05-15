public class Q2 {
    public static void main(String[] args) {
        String val = "Consultadd Pvt";
        String [] valstr = val.split(" ",0);
        for(String a:valstr){
            String temp = "";
            char t;
            for(int i=0; i<a.length(); ++i){
                t = a.charAt(i);
                temp = t + temp;
            }
            System.out.print(temp + " ");
        }
    }
}
