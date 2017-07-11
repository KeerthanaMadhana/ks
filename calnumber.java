package Guvi;
import java.util.Scanner;
public class Calculatenumber {
	public static void main(String[] args) {
		int temp1=0,temp=0;
		for(int i=1;i<20;i++){
		temp1=temp1+i;
		}
		System.out.println(temp1);
		for(int i=20;i<60;i++){
		if(i%2!=0){
			temp=temp+i;
		}
				
		}
		System.out.println(temp);
		
	}
}
