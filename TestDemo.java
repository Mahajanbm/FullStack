class  Two
{
float id;
String name;
String city;
String dept;

void data(float id,String name,String city,String dept)
{
this.id=id;
this.name=name;
this.city=city;
this.dept=dept;

}


void display()
{
System.out.println("Id is: "+id);
System.out.println("name is: "+name);
System.out.println("city is: "+city);
System.out.println("dept is: "+dept);

}
}


class TestDemo
{
public static void main(String args[])
{
Two t1=new Two();
t1.data(101,"Mahi","Hyd","Dev");
t1.display();
}

}