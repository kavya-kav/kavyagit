public class twodimarrl
{
public static void main(String[] args)
{
int a=1,b=2,c=3,d=4;
int x[]={1,2,3,4};
int y[]={2,3,4,5};
int z[]={5,4,3,2};
int n[][]={{1,2,3,4},{2,3,4,5},{5,4,3,2}};
for(int i[] : n)
{
 for(int j : i)
{
System.out.print(j +" ");
}
System.out.println("");
}
}
}