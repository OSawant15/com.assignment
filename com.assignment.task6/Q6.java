import java.util.Scanner;
class Complex{
    int real;
    int imaginary;

    Complex(){

    }

    Complex(int a, int b){
        this.real = a;
        this.imaginary = b;
    }

    public Complex add(Complex c1, Complex c2){
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
    public Complex sub(Complex c1, Complex c2){
        Complex temp1 = new Complex();
        temp1.real = c1.real - c2.real;
        temp1.imaginary = c1.imaginary - c2.imaginary;
        return temp1;
    }

    public Complex mult(Complex c1,Complex c2){
        Complex temp2 = new Complex();
        temp2.real = (c1.real*c2.real)-(c1.imaginary*c2.imaginary);
        temp2.imaginary = (c1.real*c2.imaginary) + (c1.imaginary*c2.real);
        return temp2;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the real part");
        int a = sc.nextInt();
        System.out.println("Enter the imaginary part");
        int b = sc.nextInt();
        Complex o1 = new Complex(a,b);
        System.out.println("Enter the real part");
        int c = sc.nextInt();
        System.out.println("Enter the imaginary part");
        int d = sc.nextInt();
        Complex o2 = new Complex(c,d);
        Complex o3 = new Complex();
        o3 = o3.add(o1,o2);
        System.out.println("Addition is:"+o3.real+"+"+ o3.imaginary+"i");

        Complex o4 = new Complex();
        o4 = o4.sub(o1, o2);
        System.out.println("Subtraction is:"+o4.real+"+"+ o4.imaginary+"i");

        Complex o5 = new Complex();
        o5 = o5.mult(o1, o2);
        System.out.println("Multiplication is:"+o5.real+"+"+ o5.imaginary+"i");

    }
    
}
