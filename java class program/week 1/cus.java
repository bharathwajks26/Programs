import java.io.*;
import java.util.*;
class Customer
{
  public int AccountNo,AccName,Balance=0;
  public boolean state = false;
  Scanner s = new Scanner(System.in);
  
  synchronized public void withdraw(int n)
  {
    if(n>Balance || state)
    {
      state = true;
      while(state)
      {
        try 
        {
          System.out.println("Waiting for deposit due to insufficient balance.");
          deposit();
          wait(1);
          withdraw(n);
        } 
        catch (InterruptedException e) 
        {
          Thread.currentThread().interrupt(); 
          System.err.println("Thread Interrupted");
        }
      }
    }
    else
    {
      int temp = Balance;
      Balance-=n;
      System.out.println("Remaining Balance( "+temp+" - " +n+ "): "+Balance);
    }
  }
  synchronized public void deposit()
  {
    if(state)
    {
      System.out.print("Enter the amount to be deposited: ");
      int amt =  s.nextInt();
      Balance += amt;
      notifyAll();
      state = false;
    }
    else
    {
      System.out.print("Enter the amount to be deposited: ");
      int amt =  s.nextInt();
      Balance += amt;
    }
  }
}

public class cus 
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the amount to be withdrawn: ");
    int amt = s.nextInt();
    Customer c = new Customer();
    c.withdraw(amt);
  }
}