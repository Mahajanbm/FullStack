class  BatchTwo
{
 int a;
 int b;
int c;
void add(int x,int y)
{
a=x;
b=y;
c=a+b;
System.out.println("Addition: "+c);
}
}

 class Test
{

public static void main(String [] args)
{
BatchTwo b2=new BatchTwo();
b2.add(20,60);
b2.add(50,80);
}
}