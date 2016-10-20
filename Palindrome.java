import java.util Scanner;

public class Palindrome {
public static void main(String[args]
int r,sum=0,temp;
System.out.println("Enter a number");
Scanner scan = new Scanner;
int num= scan.nextInt();
temp = n;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
{
System.out.println("It is palindrome");
}
else
{
System.out.println("It is not a palindrome");
}
}

