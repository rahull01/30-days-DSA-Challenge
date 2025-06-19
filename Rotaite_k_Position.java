
import java.util.Scanner;

public class Rotaite_k_Position {

    public static int[] rotatio_k_position(int arr[],int K)
    {
            int num = arr.length;
            ReverseLogic(arr, 0, num-1);
            ReverseLogic(arr, 0, K-1);
            ReverseLogic(arr, K, num-1);
            return arr;
    }
    public static void ReverseLogic(int arr[],int start,int end)
    {
   
        while(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please Enter the value of K :");
        int K = sc.nextInt();
        System.out.println("please inter the Size of your an Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("please inter the Element of your Array");
        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    int final2[] =  rotatio_k_position(arr, K);
    System.out.print("After rotation of "+ K + " position the array is:");
     for(int final1 : final2)
     {
        System.out.print(final1 +" ");
     }
    

}
}
