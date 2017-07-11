package Guvi;
import java.util.*;
public class Sum15 {
	public static void main(String[] args) {
		int i,j,sum=0;
		for(i=1;i<=15;i++){
			for(j=1;j<=i;j++){
				sum=sum+j;}
				System.out.println(sum);
				
				sum=0;
			
		}
		for(int q=15;q<=45;q++){
			
			if(q%2!=0){
			sum=q+sum;}
			System.out.println("the odd no sum of 15 to 45 is:"+sum);
				
				}
			}

}


