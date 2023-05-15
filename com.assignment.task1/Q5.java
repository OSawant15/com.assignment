import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        int radius;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius :");
        radius = sc.nextInt();
        area = 3.14 * radius*radius;
        System.out.println("Area is :" + area);
    }
    
}
