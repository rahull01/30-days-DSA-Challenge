
import java.util.Scanner;


class target
{

    public static int Targeted_value(int array[] , int target)
    {
        int count = 0;
        for(int i=0; i<array.length; i++)
        {
            if(target == array[i])
            {
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
          int count = 0;
          //int target;
        Scanner sc = new Scanner(System.in);
        System.out.print("please your target :");
        int target = sc.nextInt();
        System.out.print("Now entre the size of your an array :");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("please enter the elements of your an array :");

        for(int i=0; i<arr.length; i++)
        {
             arr[i] = sc.nextInt();
        }

        int count0 = Targeted_value(arr,target);
        System.out.print("total targeted count is :" + count0);
      
    }
}