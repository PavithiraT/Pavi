import java.util.Scanner;
public class Prime{
  public static void main(String args[]){
  int temp;
  boolean isPrime=true;
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a number for check:");
  int num=scan.nextInt();
  for(int i=2;i<=num/2;i++)
  {
  temp=num%i;
  if(temp==0)
  {
  isPrime=false;
  brerak;
  }
  }
  if(isPrime)
  System.out.println(num + " is Prime Number");
  else
  System.out.println(num+ "is not Prime Number");
  }
  }
