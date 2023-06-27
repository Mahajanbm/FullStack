class Business
{
static float b=15.0f;
public void demo()
{
System.out.println(Business.b);
}
}
class DemoService
{
public static void main(String [] args)
{
 Business b1=new Business();
b1.demo();
b1.demo();
}
}