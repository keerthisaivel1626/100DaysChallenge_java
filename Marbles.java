//keerthana v.
//2018272023
//marbles no4 question

public class Marbles {
   public static void main(String[] args) {
  //Scanner sc=new Scanner(System.in);
     //case 1
       int[] Arr = new int[]{1,0,1,2,0,0};
    System.out.println(MarblesPar(Arr));
       //case2
       int[] Arr1 = new int[]{1,0,0,0,1,1};
       System.out.println(MarblesPar(Arr1));
       //case 3
      // int[] Arr3 = new int[]{ 0,0,0,0,0,0 };
       //System.out.println(MarblesPar(Arr3));
   } 
   static String MarblesPar(int arr[]){
    String str;
    int sum=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            arr[i]=3;
        }else if(arr[i]==0){
            arr[i]=1;
        }else if(arr[i]==2){
             arr[i]=4;
        }
    }
    for(int j=0;j<arr.length;j++){
     sum=sum+arr[j];
    }
    if(sum%2==0){
        str="can be divided";
    }else{
      str="can't be divided";
    }
    return str;
   }
}
