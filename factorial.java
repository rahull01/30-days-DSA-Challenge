
import java.util.Scanner;

public class factorial {

    public static int sumOfSquare(int n, int m)
    {
        if(m == 0)
        {
            return 1;
        }
        return n * sumOfSquare(n, m-1);
    }

    public static int calculateTheDigits(int n)
    {
        if(n == 1) return 1;
        return 1 + calculateTheDigits(n/10); 
       
    }

    public static int sumOfAll(int n)
    {
        if(n >= 0 && n<=9)
        {
            return n;
        }
        return  sumOfAll(n/10) + sumOfAll(n%10);
       
    }

    public static int fibo(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2);

    }

    public static  int  facto(int n)
    {
        if(n==1 || n == 0)
        {
            return 1;
        }
      
       return n * facto(n-1);
    }

   public static void main(String arg[])
   {
     Scanner sc = new Scanner(System.in);
     //int n = sc.nextInt();
     System.out.println(sumOfSquare(2, 5));
    // System.out.println(calculateTheDigits(n));
   //  System.out.println(sumOfAll(n));
//    // int ans =  facto(n);
//     System.out.println(fibo(n));
//    // System.out.println(ans);
   }
}