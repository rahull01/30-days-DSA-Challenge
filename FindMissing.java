public class FindMissing {

    public static int Find_Missing_Num(int array[])
    {
        int ans;
        int index = array.length+1;
        int sum_of_arryas = index * (index + 1) / 2;
        int sum = 0;
        for(int i=0; i<array.length; i++)
        {
           sum += array[i];
        
        }
         ans = sum_of_arryas - sum;

         return ans;
            }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};

        int ans2 = Find_Missing_Num(arr);
        System.out.println("your missing numbe is " + ans2);
    }
    
}
