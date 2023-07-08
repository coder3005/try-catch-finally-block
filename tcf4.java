/* try-catch-finally */
class Handling
{
    public static  void main(String[] args) {
        try 
        {
            System.out.println("Abhi Gupta");
            int a=20,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("like share");
        }
        catch(ArithmeticException a)
        {
            int x=20,y=0,z;
            z=x/y;
            System.out.println(z);
            System.out.println("can't divide by zero");
        }
        finally
        {
            int m=20,n=0,p;
            p=m/n;
            System.out.println(p);
            System.out.println("subscribe");
        }
        System.out.println("main method ended");
    }
}
