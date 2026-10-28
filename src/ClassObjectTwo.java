class Students{
    String name;
    int mark1;
    int mark2;
    int mark3;

    void displayDetails() {
        System.out.println("Student:"+name);
        System.out.println("Mark1:"+mark1);
        System.out.println("Mark2:"+mark2);
        System.out.println("Mark3:"+mark3);
    }
    double calculateAverage(){
        return(mark1+mark2+mark3/3.0);
    }

}

public class ClassObjectTwo {
    public static void main(String[] args) {
        Students s1;
        Students s2;
        s1=new Students();
        s2=new Students();
        s1.name= "Prakriti";
        s1.mark1=98;
        s1.mark2=77;
        s1.mark3=90;

        s2.name="shirish";
        s2.mark1=78;
        s2.mark2=67;
        s2.mark3=98;

    s1.displayDetails();
        System.out.println("Total Average Marks:"+s1.calculateAverage());
    s2.displayDetails();
        System.out.println("Total Average Marks:"+s2.calculateAverage());

    }

}