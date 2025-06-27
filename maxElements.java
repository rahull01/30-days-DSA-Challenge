public class maxElements {
    public static int maxArr(int arr[], int index)
    {
        if(index == arr.length-1)
        {
            return arr[index];
        }
        int smallAns = maxArr(arr,index+1);
        return Math.max(arr[index], smallAns);
    }
    public static int minArr(int arr[], int index)
    {
        if(index == arr.length-1)
        {
            return arr[index];
        } int smallAns = minArr(arr, index+1);
        return Math.min(arr[index],smallAns);
    }
    public static void main(String arg[])
    {
        int array[] = {6,9,4,8,3,10};
        int res =  maxArr(array, 0);
        System.out.println(res);
        int res2 = minArr(array, 0);
        System.out.println(res2);
    }
}
