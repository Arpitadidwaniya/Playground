//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int sal)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+sal);
  }
}
class CSE extends Faculty
{
  public void salary(int sal)
  {
    //write your CSE class statements
     System.out.println("CSE Faculty: "+(sal+3000));
  }
}
class IT extends CSE
{
  public void salary(int sal)
  {
    //write your IT class statements
     System.out.println("IT Faculty: "+(sal+5000));
  }
}
class ECE
{
  public void salary(int sal)
  {
    //write your ECE class statements
     System.out.println("ECE Faculty: "+(sal+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
     ECE obj = new ECE();
    CSE o=new CSE();
    IT ob=new IT();
    Faculty g =new Faculty();
    int i = in.nextInt();
    
    
    if(i>0)
    {
   
      g.salary(i);
      o.salary(i);
      ob.salary(i);
      obj.salary(i);
    }
    else
    {
      System.out.println("null");
    }
    //implement your required concept here
    
  }
}