
import java.util.Scanner;

public class IfSorted {

     public static boolean IfArrayIsSorted(int array[])
     {
        boolean isSorted = true;

        for (int i=0 ; i<array.length-1; i++) 
        {
          if(array[i+1] < array[i])
          isSorted = false;  
        }

        return isSorted;

     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the Size of your an Array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("please enter the element of your an Array :");
        
            for(int i=0; i<arr.length; i++)
            {
            arr[i] = sc.nextInt();
        }  
        
       boolean IsOrnot =  IfArrayIsSorted(arr);
       System.out.println(IsOrnot + " your Array is Sorted");
    
    }
    
}
