import java.util.*;

    class Empo{
    private int id;
    private String name;

    public Empo(String myname){
        id = 45;
        name = myname;
    }

    public String getname() {return name;}
    public void setname(String n) {this.name = n;}
    public void setid(int i) {this.id = i;}
    public int getid() {return id;}
    }
 public class condstructor_java {
 public static void main(String[] args) {
    Empo harry = new Empo("shahbaz");

    System.out.println(harry.getid());
    System.out.println(harry.getname());
  }

} 