

public class secondLargest2nd {

    public static int  anotherApproach(int arr[])
    {
         int FirstLargest = arr[0];
         int SecondLaest =  arr[1];


        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > FirstLargest)
            {
                SecondLaest = FirstLargest;
                FirstLargest = arr[i];
            } 
             else if(arr[i] > SecondLaest && arr[i]!= FirstLargest)
            {
                SecondLaest = arr[i];
            }
        }
        return SecondLaest;
    }

    public static void main(String[] args) {
        int arr[]  = {80,69,95,80,95,90};
        int secondlargest = anotherApproach(arr);
        System.out.println("your second Largest Element is :" +secondlargest);

    }
    
}
