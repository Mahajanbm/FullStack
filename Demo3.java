class Demo3
{
public static void main()
{
System.out.println("this is main method");
}
public static void main(int a)
{
System.out.println("this is string main method");
}
public static void main(String[] a)
{
main();
main(10);
System.out.println("this is string main method");
}
}