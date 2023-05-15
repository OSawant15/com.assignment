class Triangle{
    public int perimeter(int a, int b, int c){
        int peri = a+b+c;
        return peri;
        
    }
    public double area(int a, int b, int c){
        double t = (a+b+c)/2;
        double ar1 = Math.sqrt(t*(t-a)*(t-b)*(t-c));
        return ar1;
    }
}



public class Q2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        int d = t1.perimeter(3,4,5);
        System.out.println("Perimeter is :"+ d);
        double d1 = t1.area(3,4,5);
        System.out.println("Area is: "+ d1);

    
    }
    
}
