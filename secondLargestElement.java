
import java.util.Arrays;

 class secondLargestElement {
                

    public static void  FindSecondLargestElement(int arr[])
    {
       Arrays.sort(arr);

    }
    public static void main(String[] args) {
        int arr[]  = {10,20,30,40,50};
        FindSecondLargestElement(arr);
        System.out.println("Second largest element is :" + arr[arr.length-2]);
       
    }
    
}
