class Rectangle{
    int length;
    int breadth;
    
    Rectangle(){
        length = 0;
        breadth = 0;
    }
    Rectangle(int r1,int r2){
        length = r1;
        breadth = r2;
    }
    Rectangle(int a){
        length = a;
        breadth = a;
    }
    public void area(){
        System.out.println("Area is:"+(length*breadth));
    }
}

public class Q5 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area();
        Rectangle r2 = new Rectangle(10,20);
        r2.area();
        Rectangle r3 = new Rectangle(10);
        r3.area();
    }
    
}
