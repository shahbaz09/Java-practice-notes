import java.util.*;
public class varargs_jav{
   
    /*static int sum(int ...arr){
        //int [] arr;
        int result=0;
        for(int a: arr){
            result += a;
        }
        return result;
     }
    public static void main(String[] args) {
         System.out.println("welcome to varargs tutorial");
         System.out.println("The Sum of 4 and 5 is:" + sum(4, 5));
          System.out.println("The Sum of 4 and 5 is:" + sum(4, 3, 5));*/
         

          // video 32 recursion in java 
          static int factorial(int n){     
            if(n==0 || n==1){
                return 1;
            }
            else{
                return n * factorial(n-1);
             }  

            }
            static int factorial_iterative(int n){     
            if(n==0 || n==1){
                return 1;
            }
            else{
                int product = 1;
                for (int i=1; i<=n; i++){
                    product *= i;
                }
                return product;
            }  
          }
          public static void main(String[] args) {
            int x = 4;
            System.out.println("the value of factorial n is :" + factorial(x));
             System.out.println("the value of factorial n is :" + factorial_iterative(x));

    }

}  