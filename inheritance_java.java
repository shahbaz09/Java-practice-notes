import java.util.*;

    class base{
      public  int x;

        public int getx(){
            return x;

        }

        public void setx(int x){
            System.out.println("i am setting x now");
            this.x = x;
        }

        public void printme(){
            System.out.println("i am a constructor");
        }
    }

    class Derived extends base{
       public int y;

        public int gety(){
            return y;

        }

        public void sety(int y){
            this.y = y;
        }

      
    }
public class inheritance_java {
 public static void main(String[] args) {
       base b = new base();
       b.setx(40);
       System.out.println(b.getx());

       Derived d = new Derived();
       d.setx(43);
       System.out.println(d.getx());

       }
  }

 