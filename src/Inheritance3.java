class Shape{
    void display(){
        System.out.println("This Is A Shape");
    }
}
class Circle extends Shape {
    void circle(){
        System.out.println("This Is A Circle");
    }
}
class Rectangle extends Shape{
    void rectangle(){
        System.out.println("This Is A Rectangle");
    }
}
public class Inheritance3 {
    public static void main(String[] args){
        Circle c = new Circle();
        c.display();
        c.circle();

        Rectangle r1 = new Rectangle();
        r1.display();
        r1.rectangle();
    }
}
