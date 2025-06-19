
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
  

    public static int[] RemoveDuplicate1(int array[])
    {
         Arrays.sort(array);
       int temp[] = new int[array.length];
       int j = 0;
       for(int i = 0; i<array.length-1; i++)
       {
            if(array[i] != array[i+1])
            {
                temp[j] = array[i];
                j++;
            }
       }
       temp[j] = array[array.length-1];
       j++;
       int[] result = new int[j];
       for(int i=0; i<j; i++)
       {
        result[i] = temp[i];
       }
       return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of your Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
             int res [] =  RemoveDuplicate1(arr);
             for (int ress  : res) 
             {
                System.out.print(ress + " ");    
             }
      
        System.out.println("Array after removing duplicates");
    }
}
