
import java.util.Scanner;

public class ReverseArrya {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please entre the Size of your an array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("please entre the element of your an array");
        for(int i=0; i<arr.length; i++)
        {
        arr[i] = sc.nextInt();
        }

        System.out.println("your reversed array");
        reverse_array(arr);
        for (int rarray : arr) {
            System.err.print(rarray +"\t");
        }

    }

    public static void reverse_array(int array[])
    {
        for (int i=0; i<array.length / 2; i++) 
        {
           int temp = array[i];
           array[i] = array[array.length-i-1];
           array[array.length-i-1] = temp;
        }
    }
    
}
