public class p3 
{
    public static void main(String args[])
    {
        int num1=2,num2=4;
        calc c=new calc();
        int result=c.add(4,5);
        System.out.println(result);

    }
    
}
class calc
{
    public int add(int num1,int num2)
    {
        int r=num1+num2;
        return r;
    }
    
}
