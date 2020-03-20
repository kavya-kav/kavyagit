package cloning;
public class cloningdemo
{
public static void main(String[] args)
{
Abc obj=new Abc();
obj.i=6;
obj.j=2;
System.out.println(obj);
}
}
class Abc
{
int i;
int j;
public String toString()
{
return "Abc{"+"i=" +i+", j="+j+ ')';
}
}

