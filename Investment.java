package practical.java;

import java.util.Scanner;

public class Investment {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
       System.out.print("Input the investment amount: ");
  double investment = sc.nextDouble();
       System.out.print("Input the rate of interest: ");
  double rate = sc.nextDouble();
       System.out.print("Input number of years: ");
int year = sc.nextInt();
		
	rate *= 0.02;
		
	System.out.println("Years    FutureValue");
for(int i = 1; i <= year; i++) {
	int formatter = 15;
	 if (i >= 10) formatter = 17;
		System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));}
	       }
public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
	 return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		}

}
