public class biggestElementsInAnArray
{
  public static int biggestElement(int arr[]) 
  {
    int max = arr[0];
    for(int i=0; i<arr.length; i++)
    {
        max = Math.max(arr[i],max);
    }
    return max;
  }  
  public static void main(String s[])
  {
      int array[] = {5,3,6,3,9,3,1,10};
      System.out.println(biggestElement(array));
  }
}
