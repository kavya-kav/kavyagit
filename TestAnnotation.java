class Ann{  
void m(){
System.out.println("hello m");
}    
void n()
{
System.out.println("hello n");
}  
}  
  class TestAnnotation
{  
public static void main(String args[]){  
  
Ann a=new Ann();  
a.n();  
}
}