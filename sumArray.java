
import java.util.Scanner;


public class sumArray {
    

    public static int SumOfArray(int array[])
    {
       int sum = 0;
       for(int i=0; i<array.length; i++)
       {
          sum += array[i];
       }
       return sum;
    }
    public static void main(String[] args) {
        
       Scanner sc = new Scanner (System.in);
        System.out.println("please enter the size of your Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Please enter the elements of your an array");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        } 

      //  int arr[] = {7,3,4,5,1};

        int sumo = SumOfArray(arr);
        System.out.println("the total sum of your an array is :" +sumo);
    }
}
