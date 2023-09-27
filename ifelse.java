import java.util.*;

public class ifelse{
    public static void main(String[] args){
        /* int age = 18;
         if(age>18){
            System.out.println("you can drive car");
         }else{
            System.out.println("you cannot drive car");
         }*/

        /*boolean a = false;
         boolean b = false; 
         boolean c = false; 
         if(a && b && c){
            System.out.println("yes");
         }else{
            System.out.println("no");
         }*/

          int age;
         System.out.println("enter your age");
         Scanner Sc = new Scanner(System.in);
         age = Sc.nextInt();

        /*  if(age>56){
            System.out.println("you are ex");
         }
         else if(age>46){
            System.out.println("you are semi-ex");
         }
         else if(age>36){
            System.out.println("you are pro semi ex");
         }
         else{
            System.out.println("you are not ex");
         }*/
         
         switch(age){
            case 18:
              System.out.println("you are adult");
              break;
              case 23:
              System.out.println("you are join job");
              break;
              case 60:
              System.out.println("you are pro job");
              break;
              default:
              System.out.println("enjoy you life");
         }
    }
}   