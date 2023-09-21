import java.util.*;
  class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
    System.out.println("My id is "+ id);
    System.out.println(" and my name is "+ name);
    }
     public int  getsalary(){
        return salary;
     }
  }
public class oop_java{

    public static void main(String[] args) {
       System.out.println("This is our custom class");
       Employee harry = new Employee();
       Employee john = new Employee();

       // setting attribute for harry
       harry.id = 12;
       harry.salary = 34;
       harry.name = "codewithharry";

       //setting attributes for john
        john.id = 17;
        john.salary = 12;
       john.name = "john kumar";


       // printing the attribute
       harry.printDetails();
        john.printDetails();
        int salary = john.getsalary();
        System.out.println(salary);
      // System.out.println(harry.id);
       //System.out.println(harry.name);
    }

} 

