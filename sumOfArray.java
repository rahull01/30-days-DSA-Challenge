public class sumOfArray 
{
 public static int sumOfArray(int arr[],int index)
 {
     if(index == arr.length)
     {
        return 0;
     } int smallAns = sumOfArray(arr, index+1);
     return arr[index] + smallAns;
 }
 public static void main(String arg[])
 {
    int arr[] = {1,2,3,4,5,6};
   System.out.println(sumOfArray(arr, 0));

 }
}
