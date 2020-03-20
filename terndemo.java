public class terndemo
{
public static void main(String[] args)
{
object  obj1;
object  obj2;
if(true)
{
obj1 = new Integer(5);
}
else
{
obj1 = new Double(14.0);
}
System.out.println(obj1);
obj2=true?new  Integer(10):new Double(14.0);
System.out.println(obj2);
}
}