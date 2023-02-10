import java.io.*;
import java.util.*;
class Bank{
    private String name;
    private int acc;
    private int bal;
    private static int accountTrace;
    public Bank (String s1){
        name=s1;
        acc=accountTrace++;
    }
    public static void setAccountTrace(int value){
        accountTrace=value;
    }
    public int getAcc(){
        return acc;
    }
    public String getName(){
        return name;
    }
    public int getBal(){
        return bal;
    }
    public void deposit(int n){
        bal+=n;
    }
    public void withdraw(int m){
        if(bal<m){
            System.out.println("Negative Balance Transaction Cancelled");
        }
        else{
            bal-=m;
        }
    }
    public void display(){
        System.out.println(acc+" "+name+" "+bal);
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int d=in.nextInt();
        Bank.setAccountTrace(d);
        in.nextLine();
        String s=in.nextLine();
        int t=Integer.parseInt(in.nextLine());
        Bank b=new Bank(s);
        for(int i=0;i<t;i++){
            String [] h=in.nextLine().split(" ");
            if(h[0].equals("Deposit")){
                b.deposit(Integer.parseInt(h[1]));
            }
            else if(h[0].equals("Withdraw")){
                b.withdraw(Integer.parseInt(h[1]));
            }
            else{
                b.display();
            }
        }
    }
}
