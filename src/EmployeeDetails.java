class Employee{
    String name;
    double basicsalary;
    double bonus;
    double salary;

    void displayDetails(){
        System.out.println("Details of the Employee");
        System.out.println("Employee Name:"+name);
        System.out.println("Basic Salary:"+basicsalary);
        System.out.println("Bonus:"+bonus);
    }
    void calculateSalary(){
        salary = basicsalary+bonus;
        System.out.println("Employee Salary:"+salary);
    }
}
public class EmployeeDetails{
    public static void main(String[] args) {
       Employee e1;
       Employee e2;
       e1=new Employee();
       e2=new Employee();

       e1.name="Prakriti";
       e2.name="Shirish";

       e2.basicsalary=60000;
       e1.basicsalary=50000;

       e1.bonus=1000;
       e2.bonus=2000;

       e1.displayDetails();
       e1.calculateSalary();
        System.out.println();
        e2.displayDetails();
        e2.calculateSalary();
    }
}
