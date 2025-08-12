

public class BankAccount
{
    
    private int accountnumber;
    private int balance;
    private String customername;
    
    public BankAccount(){
        //first constructer
        accountnumber = 0;
        balance= 0;
        customername = "";
        
    }
    public BankAccount(int x, int y, String z){
        //first constructer
        accountnumber = x;
        balance= y;
        customername = z;
        
    }
    
    public BankAccount(int y)
    {
        accountnumber = 0;
        balance = y;// only has specic value
        customername = "";
        
    }
    
    public void setAccountNumber(int x)
    {
        accountnumber = x;
        
    }
    
    public void setBalance(int y)
    {
        balance = y;
        
    }
    
    public void setCustomerNamer(String z)
    {
        customername = z;
        
    }
    
    public int getAccountNumber()
    {
        return accountnumber;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public String getCustomerName()
    {
        return customername;
    }
    
    public void withdraw (int x)
    {
        balance = balance-x; //takes away from balance
        
    }
    
    public void deposit (int x)
    {
        balance = balance + x; //adds to balance
        
    }
    
    public void reset ()//cuz its 0 so empty
    {
        balance = balance = 0; //reset
        
    }
    
}
