package ks;
import java.util.Scanner;
public class Reverse {
     public static void main(String args[]){
    	 int n,rev=0,rem;
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter the number:");
    	 n=s.nextInt();
    	 while(n!=0)
    	 {
    		 rem=n%10;
    		 rev=rev*10+rem;
    		 n=n/10;
    	 }
    	 System.out.println("Reverse ="+rev);
     }
     
}
