import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        int units;
        double ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the units :");
        units = sc.nextInt();
        if(units <= 60){
            ans = units * 0.30;
            ans = ans*1.20;
            System.out.print("Total bill is:"+ ans);
        }
        else if(units <=150){
            ans = ((60*0.30)+(units - 60)*0.75);
            ans = ans*1.20;
            System.out.println("Total bill is:"+ ans);
        }
        else if(units <= 270){
            ans = ((60*0.30)+(90*0.75)+(units-60-90)*1.10);
            ans = ans*1.20;
            System.out.println("Total bill is:"+ ans);
        }
        else if(units >= 300){
            ans = ((60*0.30)+(90*0.75)+(120*1.110)+(units - (60+90+120))*2.50);
            ans = ans*1.20;
            System.out.println("Total bill is:"+ ans);
        }

    }
    
}
