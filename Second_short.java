/**
 * Second_short
 */
import java.util.*;

public class Second_short {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];//2,5,7,1,4
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int first, second, arr_size = arr.length; 
  
        /* There should be atleast two elements */
        if (arr_size < 2) 
        { 
            System.out.println(" Invalid Input "); 
            return; 
        } 
  
        first = second = Integer.MAX_VALUE;
        System.out.println("djbvfejvhujeh:"+first+"                    jfheiughueihg                 "+second);
        for (int i = 0; i < arr_size ; i ++) 
        { 
            /* If current element is smaller than first 
              then update both first and second */
            if (arr[i] < first) 
            { 
                second = first; 
                first = arr[i]; 
            } 
  
            /* If arr[i] is in between first and second 
               then update second  */
            else if (arr[i] < second && arr[i] != first) 
                second = arr[i]; 
        }
        System.out.println("The smallest element is " + 
        first + " and second Smallest" + 
        " element is " + second);  
    }
}