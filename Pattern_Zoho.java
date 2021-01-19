/**
 * Pattern_Zoho
 */
import java.util.*;
public class Pattern_Zoho {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println("enter the input");
     int input=sc.nextInt();
     int i=0;
     int sec_space=1;
     int num=1;
     int mid=num;
     for(i =0;i<input;i++){
        int space=i;
         while(space<input-1){
         System.out.print(" ");
           space++;
         }
        System.out.print(num);
       
        int count=2;
        int mid_space=input+count-2;
        //5,3,1
        if(num>1){
        
            
                 while( sec_space<= mid_space){//1<3
                  
                   if(sec_space<3)
                   mid=num;
                   mid=mid+1;
                    System.out.print(mid);
                   System.out.print(num);
                   sec_space =sec_space+2;
                   
                 }  
            }
            System.out.println();
            num=mid+1;  
        }    
    }
}