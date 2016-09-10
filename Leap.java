public class Leap {
  public Static void main(String arg[]) {
  
    int yr;
    Scanner scan = new Scanner(system.in);
    
    System.out.println("Enter the year");
    yr=scan.nextInt();
    
    if((yr%4==0) && (yr%100!=0)){
    System.out.println("It is a leap year"); 
    }
    
    else if(yr%100==0) {
    System.out.println("It is not aleap year"); }
    
    else if (yr%400==0) {
    System.out.println("It is a leap year"); 
    }
    
    else {
    System.out.println("IT is not a leap year");
    
 }   
}
