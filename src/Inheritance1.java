class Person{
    void introduce(){
        System.out.println("I am a Person");
    }
}

class Student extends Person {
    void teach(){
        System.out.println("Student is Teaching");
    }
}
class Child extends Person{
    void study(){
        System.out.println("Child is Studying");
    }
}
public class Inheritance1 {
    public static void main(String[] args){
        Student s = new Student();
        s.introduce();
        s.teach();

        Child c = new Child();
        c.introduce();
        c.study();
    }
}
