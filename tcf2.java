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
        catch(NullPointerException a)
        {
            System.out.println("can't divide by zero");
        }
        finally
        {
            System.out.println("subscribe");
        }
        System.out.println("main method ended");
    }
}
