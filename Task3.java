import java.io.*;
import java.util.Scanner;
public class Task3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int balance=1000;
        System.out.println("\n\t\tCHOOSE ANY SERVICE");
        System.out.println(" Click one number from 1 to 4 for below services");
        System.out.println("\n 1.WITHDRAWAL\n 2.DEPOSIT\n 3.BALANCE CHECK\n 4.CANCEL");
        while(true){
            System.out.print("\n Your choice : ");
            int ch=sc.nextInt();
            switch(ch){
                case 1: 
                    System.out.print("\n Enter withdrawal amount : ");
                    int wamnt=sc.nextInt();
                    if(balance>wamnt){
                        balance-=wamnt;
                        System.out.print("\n\tWithdrawing amount : "+wamnt+"\n");
                        System.out.print("\n\t<-- Current Balance : "+balance+" -->\n");
                    }
                    else{
                        System.out.println("\n\t**INSUFFICIENT BALANCE**");
                    }
                    break;
                case 2: 
                    System.out.print("\n Enter deposit amount : ");
                    int damnt=sc.nextInt();
                    balance+=damnt;
                    System.out.print("\n\tDepositing amount : "+damnt+"\n");
                    System.out.print("\n\t<-- Current Balance : "+balance+" -->\n");
                    break;
                case 3: 
                    System.out.print("\n\t<-- Current Balance : "+balance+" -->\n");
                    break;
                case 4: 
                    System.out.println("\n\tTHANKYOU FOR TAKING THE SERVICE!!");
                    System.exit(0);
            }
    }
    }
}