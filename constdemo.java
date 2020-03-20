public class constdemo
{
public static void main(String[] args)
{
Abc obj = new Abc(5.5);
}
}
class Abc
{
public Abc()
{
System.out.println("In Abc const");
}
public Abc(int i)
{
System.out.println("In Abc const int");
}
public Abc(double d)
{
System.out.println("In Abc const Double");
}
} 