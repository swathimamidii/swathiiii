import java.util.Scanner;
public class p2 
{ 
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long fact=1;
    if(n==0||n==1)
    {
        System.out.println("factorial is 1");
    }
    else
    {
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
    sc.close();
    


}
    
}
