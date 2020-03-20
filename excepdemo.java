class excepdemo
{ 
    public static void main(String[] args) 
    {
int a,b,c=0;
int d[]=new int[5];
a=4;
b=0;
try
{
c=a/b;
for(int i=0;i<=5;i++)
{
d[i]=i+1;
}
}
catch(ArithmeticExpection  e)
{
System.out.println("Cannot devide By zero");
}
System.out.println(c);
}
}
