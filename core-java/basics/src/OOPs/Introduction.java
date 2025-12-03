package OOPs;

public class Introduction {
    public static void main(String[] args) {
        Student defaultStu = new Student();
        Student rohanStu = new Student(26, "Rohan", 78.3f);

//        System.out.println(defaultStu.name);
//        System.out.println(rohanStu.name);
        rohanStu.greeting();
        defaultStu.greeting();
    }

    static class Student{
        int rno;
        String name;
        float marks;

//        Constructor: special type of func that runs when an object is instantiated. Constructor overloading is possible
        Student(){
//            this.rno = 12;
//            this.name = "Default Name";
//            this.marks= 89.3f;

//            Calling another constructor from a constructor
//            internally works as new Student(12, "Default Name", 89.3f);
            this(12, "Default Name", 89.3f);
        }

        Student(int rollNo, String name, float marks){
            this.rno = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void greeting(){
            System.out.println("Hi there, "+ this.name);
        }
    }
}
