import java.util.Scanner;

class FindElements{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter the Size of your an Arrya : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.err.println("Please enter the elements of your An arrya4");

        for (int i =0; i<arr.length; i++) 
        {
           arr[i] = sc.nextInt();
        }       
        

        int LElemenets = LargestElemnt(arr);
        System.out.println("the largest Elements of your an Arrray is :"+LElemenets);

    }

    public static int LargestElemnt(int array[])
    {
          int LargestElemnt1 = array[0];
          for (int i=0; i<array.length; i++) 
          {
              if(LargestElemnt1<array[i])
              LargestElemnt1 = array[i];    
          }
          return LargestElemnt1;
    }
}