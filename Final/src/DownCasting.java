class Person{
    String name;

    public Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    String grade;

    public Student(String name){
        super(name);
    }
}

public class DownCasting {
    public static void main(String[] args) {
        Person p = new Student("Ted");

        Student s;

        s = (Student)p;

        System.out.println(s.name);
        s.grade = "a";
    }
}
