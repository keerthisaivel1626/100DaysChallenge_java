import java.io.*;
import java.util.*;
public class Second{
     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
        
         String str = sc.nextLine();
         int N= sc.nextInt();
         
        char[] str1= str.toCharArray();
        String[] str2= new String[10];
        for(int i=0;i<str.length()-N;i++)
        {
            int j=i;
            int k=1;
			//str2[i]=str1[j];
            while(k<N)
            {
            str2[i]=str2[i]+(str1[j+1]);
            j++;
            k++;
            }
        }
        
        Arrays.sort(str2);
        int max_count = 1;
			String res = str2[0]; 
        int curr_count = 1; 
		int n=str2.length;
          
        for (int i = 1; i < str2.length; i++) 
        { 
            if (str2[i] == str2[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = str2[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
      
        
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = str2[n - 1]; 
        } 
      
        System.out.println(res); 
    
        
     }
}