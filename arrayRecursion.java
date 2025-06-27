
import java.util.Arrays;

public class arrayRecursion
{
  public static int[] arr(int array[], int index)
  {
    if(index == array.length)
    {
        return array;
    }// System.out.print(array[index]);
     return arr(array,index+1);
  }   
  public static void main(String[] args) {
      int arr1[] = {1,2,3,4,5,6};
      System.out.println(Arrays.toString(arr(arr1, 0)));
  }
}
