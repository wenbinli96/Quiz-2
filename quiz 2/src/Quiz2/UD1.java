package Quiz2;

import java.util.Scanner;

public class UD1 {

	static Scanner percentage = new Scanner(System.in);
	
	public static void main(String[] args){
		
		float tuition;
		float increase;
		float total_this;
		float total;
		
		tuition = 12342;
		total = 0;
		
		for (int x=0; x<4; x++){
			if (x == 0){
				total= tuition;
				continue;}
			System.out.println("Enter percentage increase for next year");
			increase = percentage.nextFloat();
			
			total_this=tuition*(increase/100) + tuition;
			total += total_this;
		}
		System.out.println("Total cost of UD is: " + total);
		
	}
}