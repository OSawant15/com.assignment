import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        int sal;
        double ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary :");
        sal = sc.nextInt();
        if(sal <= 15000){
            ans = sal + ((sal *1.25) - sal) + ((sal*1.82) - sal);
            System.out.println("Gross salary is :"+ ans);
        }
        else if(sal <= 20200){
            ans = sal + ((sal *1.27) - sal) + ((sal*1.90) - sal);
            System.out.println("Gross salary is :"+ ans);
        }
        else if(sal > 20200){
            ans = sal + ((sal *1.36) - sal) + ((sal*1.95) - sal);
            System.out.println("Gross salary is :"+ ans);
        }
    }
    
}
