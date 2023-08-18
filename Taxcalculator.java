import java.util.Scanner;
		
public class Taxcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the Purchase Amount");
				double num=scan.nextDouble();
				System.out.println("Enter the taxRate");
				double num1=scan.nextDouble();
				double res=calculateTotalWithTax(num,num1 );
				System.out.println("Total cost including"+" "+res);
				
				
				
			}
			public static double calculateTotalWithTax(double purchaseAmount,double taxRate)
			{
					return (purchaseAmount *taxRate)+purchaseAmount;
			}

	}

