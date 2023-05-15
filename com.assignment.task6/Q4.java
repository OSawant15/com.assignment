class Student{
    String name;

    Student(String name){
        this.name = name;
    }
    Student(){
        this.name = "Unknown";
    }
    public void print1(){
        System.out.println("Name is:"+ name);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.print1();
        Student s2 = new Student("Omkar");
        s2.print1();
    }
    
}
