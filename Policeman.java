
import java.util.*; 
import java.io.*; 
 /*Name:keerthana V
 roll no:2018272023 
 no 3 rd question 
 */

class Policeman 
{ 
     public static void main(String args[]) 
    { 
        int k;
        int len; 
        //test case1
        char arr1[] =new char[] {'P','T','T','P','T' }; 
        k = 1; 
        len = arr1.length; 
        System.out.println("Output: "+max_policeThief(arr1,k,len)); 
          //test case2                    
        char arr2[] =new char[] {'T','T','P','P','T','P'}; 
        k = 2; 
        len = arr2.length; 
        System.out.println("Output: "+max_policeThief(arr2,k,len)); 
          //test case3                    
        char arr3[] = new char[]{'P','T','P','T','T','P' }; 
        k = 3; 
        len = arr3.length; 
        System.out.println("Output: "+max_policeThief(arr3,k,len)); 
    } 
    // finding the maximum number of theief  
    static int max_policeThief(char arr[],int k,int size) 
    { 
        int output = 0; 
        ArrayList<Integer> thief = new ArrayList<Integer>(); 
        ArrayList<Integer> police = new ArrayList<Integer>(); 
  
        // store indices in the ArrayList  
        for (int i = 0; i < size; i++) { 
            if (arr[i] == 'P') 
            //police police[i]
            police.add(i); 
            else if (arr[i] == 'T') 
            //thief thief[i]
            thief.add(i); 
        }  
  
 
       
        int low = 0, count = 0; 
        while (low < thief.size() && count < police.size()) { 
  // find the lowest value
            // can be caught 
            if (Math.abs(thief.get(low) - police.get(count)) <= k) { 
            output++; 
            low++; 
            count++; 
            }  
              
            // increment the minimum index 
            else if (thief.get(low) < police.get(count)) 
                low++; 
            else
                count++; 
        } 
        return output; 
    } 
  
   
} 
  