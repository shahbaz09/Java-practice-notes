import java.util.*;
public class Arrays_java {

	public static void main(String[] args) {

      // Declation and then memory allocation
       /*  int[] marks = new int[5];
         marks[0] = 100;
         marks[1] = 60 ;
         marks[2] = 70;
         marks[3] = 90;
         marks[4] = 86;*/

       //Declation and then memory allocation and initialization together
         /*int [] marks = {98, 45, 79, 99, 88};
         System.out.println(marks[4]);*/

         // arrays lenght
        /*int [] marks = {98, 45, 79, 99, 88};
          // float [] marks = {98 , 56, 90, 87,66}; 
         System.out.println(marks.length);
         System.out.println(marks[0]);*/

       /* String[] Students={"harry","subham","rohan","ritik"};
        System.out.println(Students.length);
         System.out.println(Students[3]);*/

       //Display the array(naive way)
          int [] marks = {98, 45, 79, 99, 88};
          System.out.println(marks.length);
           System.out.println("print using for loop");
          System.out.println(marks[0]);
          System.out.println(marks[1]);
          System.out.println(marks[2]);
          System.out.println(marks[3]);
          System.out.println(marks[4]);

         //display the array(for loop)
          System.out.println("print using for loop ");
         for(int i=0; i<marks.length; i++){
          System.out.println(marks[i]);
         }

         // display the array(for reverse loop array)
         System.out.println("print using for loop in reverse order");
          for(int i=marks.length -1; i>=0; i--){
          System.out.println(marks[i]);
          }

          //quick quiz: Displaying the array(for-each loop)
          System.out.println("printing using for-ech loop");
          for(int element: marks){
            System.out.println(element);
          }

        } 
    }  