interface MyInterface
{
  
   public void method1();
   public void method2();
}
class  MyInterface
{


   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
public static void main(String arg[])
   
   {
	MyInterface obj = new MyInterface();
	obj.method1();
   }
}