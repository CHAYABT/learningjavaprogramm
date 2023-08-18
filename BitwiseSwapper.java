import java.util.Scanner;
public class BitwiseSwapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter the First Number ");
				int a=scan.nextInt();
				System.out.println("Enter the Second Integer");
				int b=scan.nextInt();
				swapUsingBitwise(a,b);
				
			}
			public static void swapUsingBitwise(int x,int y)
			{
				System.out.println("Before swapping");      
				System.out.println("x= " + x + ", y= " + y);  
				x = x ^ y;  
				y = x ^ y;  
				x = x ^ y;  
				System.out.println("After swapping");  
				System.out.println("Fist= " + x + ", Second= " + y);  
						
				
			}

	

	}

