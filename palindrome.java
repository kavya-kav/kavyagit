public class palindrome
{
public static void main(String[] args)
{
int r,s=0,t;
int n=256;
t=n;
while(n>0)
{
r=n%10;
s=(s*10)+r;
n=n/10;
}
if(t==s)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
