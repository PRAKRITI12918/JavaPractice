class Student {
    static String college="ssmiet";
    String name;
    int age;
}
    public class ClassObject{
        public static void main(String[] args) {
            Student s1;
            Student s2;
            s1 = new Student();
            s2 = new Student();
            s1.name = "Prakriti";
            s1.age=20;
            s2.name="shirish";
            s2.age=18;
            System.out.println("college "+Student.college);
            System.out.println("detail1");
            System.out.println("student d1name"+s1.name);
            System.out.println("student d1age"+s1.age);
            System.out.println("student d2name"+ s2.name);
            System.out.println("student d2age"+s2.age);

        }
    }