import java.util.*;
public class associativity {

	public static void main(String[] args) {
     // precedence & associativity
        int a= 6*5-34/2;
        /*
              =6*5=30
              =34/2=17
              =30-17
              =13
         */
        int b = 60/5-34*2;
        /*
              =12-34*2
              =12-68
              =-56
         */
        System.out.println(a);
        System.out.println(b);
    }   
}  