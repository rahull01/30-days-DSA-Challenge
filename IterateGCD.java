public class IterateGCD {
    public static int igcd(int a , int b)
    {
        while(a%b != 0)
        {
            int rem = a%b;
            a = b;
            b = rem;
        } return b;
    }
    public static void main(String[] args) {
       int ans = igcd(15, 9);
       System.out.println(ans);
    }
}
