public class MoveZeros {

    public static void ZeromovesToend(int array[])
    {
          int index = 0;
        for(int i=0; i<array.length;i++)
        {
            
           

            if(array[i] != 0)

            {
               array[index] = array[i]; 
               index++;
            }
        }

        while(index < array.length)
        {
            array[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,56,34,0,65,3};

        ZeromovesToend(arr);
        for (int zero : arr)
        {
           System.out.print(zero+"\t"); 
        }

    }
    
}
