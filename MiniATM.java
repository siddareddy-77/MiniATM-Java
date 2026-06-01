import java.util.*;
public class MiniATM{
     public static void main(String[] args)
     {
          boolean start =true;
          double lastDeposit=0;
          double lastWithdraw=0;
          double balance =  50000;
          Scanner sc = new Scanner(System.in);
          while(start){
             System.out.println("1.check balance");
             System.out.println("2.deposite");
             System.out.println("3.withdraw");
             System.out.println("4.exit");
             System.out.println("5.mini statement");
             System.out.print("Enter your choice : ");
             int choice=sc.nextInt();
             switch(choice){
               case 1:
                    System.out.println("balance = "+ balance );
                    System.out.println("__________________________________________________________");
                    break;
                    
               case 2:
                    System.out.println("Enter amount  to deposit ");
                    int deposit=sc.nextInt();
                    if(deposit<=0)
                    {
                         System.out.println("Enter valid amount to deposit");
                    }
                    else{
                     balance +=deposit; 
                    lastDeposit=deposit;
                    System.out.println("Money deposited");
                    System.out.println("current balance = " + balance);
                    }
                    System.out.println("__________________________________________________________");
                    break;
               case 3:
                    System.out.println("Enter money to withdraw ");
                    double withdraw=sc.nextDouble();
                    if(withdraw<=0)
                    {
                         System.out.println("Enter  valid amount to withdraw");
                    }
                    else{
                    if(balance<withdraw)
                    {
                         System.out.println("   Insufficient balance     ");
                    }
                    else
                    {
                         balance = balance - withdraw;
                         lastWithdraw=withdraw;
                         System.out.println("Withdraw Successful");
                         System.out.println("current Balance = " + balance);
                    }
                    }
                    System.out.println("__________________________________________________________");
                    break;
               case 4:
                    System.out.println("---------Exited--------");
                    start=false;
                    System.out.println("__________________________________________________________");
                    break;
               case 5:
                    System.out.println("---- Mini Statement");
                    System.out.println("Last Deposit ="+lastDeposit);
                    System.out.println("Last Withdraw ="+lastWithdraw);
                    System.out.println("Current Balance = " + balance);
                    System.out.println("__________________________________________________________");
                    break;
               default :
                  System.out.println("Wrong Choice  Enter Correct Choice");
                  System.out.println("__________________________________________________________");
                  break;
          
          } 
          }
          sc.close();
     }
}