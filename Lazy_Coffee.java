import java.util.*;
public class Lazy_Coffee {
    //keerthana v
    //2018272023
    //qno1
   
        static int MAX = 10; 
      
        // Function to return the count of numbers possible 
        static int getCount(int n) 
        { 
            // Array of list storing possible direction 
            // for each number from 0 to 9 
            // list[i] stores possible moves from index i 
              
            int [][] list = new int[MAX][]; 
              
            // Initializing list 
            list[0] = new int [] { 0, 8 }; 
            list[1] = new int [] { 1, 2, 4 }; 
            list[2] = new int [] { 2, 1, 3, 5 }; 
            list[3] = new int [] { 3, 6, 2 }; 
            list[4] = new int [] { 4, 1, 7, 5 }; 
            list[5] = new int [] { 5, 4, 6, 2, 8 }; 
            list[6] = new int [] { 6, 3, 5, 9 }; 
            list[7] = new int [] { 7, 4, 8 }; 
            list[8] = new int [] { 8, 5, 0, 7, 9 }; 
            list[9] = new int [] { 9, 6, 8 }; 
          
            // Storing values for n = 1 
            int Arr[] = new int [] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }; 
          
            for (int i = 2; i <= n; i++)  
            { 
          
                // To store the values for n = i 
                int Arr2[] = new int [MAX]; 
          
                // Loop to iterate throuh each index 
                for (int j = 0; j < MAX; j++) 
                { 
          
                    // For each move possible from j 
                    // Increment the value of possible 
                    // move positions by Arr[j] 
                    for (int x = 0; x < list[j].length; x++) 
                    { 
                        Arr2[list[j][x]] += Arr[j]; 
                    } 
                } 
          
                // Update Arr[] for next iteration 
                for (int j = 0; j < MAX; j++) 
                    Arr[j] = Arr2[j]; 
            } 
          
            // Find the count of numbers possible 
            int sum = 0; 
            for (int i = 0; i < MAX; i++) 
                sum += Arr[i]; 
          
            return sum; 
        } 
          
        // Driver code 
        public static void main (String[] args)  
        { 
          Scanner sc=new Scanner(System.in);
            int n = 3; 
            int inpu1=sc.nextInt();
            System.out.println(getCount(inpu1)); 
            int inpu2=sc.nextInt(); 
            System.out.println(getCount(inpu2)); 

            int inpu3=sc.nextInt();
            System.out.println(getCount(inpu3)); 

          
           
        } 
    } 