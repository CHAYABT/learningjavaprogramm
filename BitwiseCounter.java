import java.util.Scanner;
public class BitwiseCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter an integer value :");
				int num=scan.nextInt();
				int res=integerToBitwise(num);
				System.out.println("Number of set bits :"+ res);
			}
			public static int integerToBitwise(int n)
			{
				int i=0;
				while(n>0) {
				if(n!=0) {
					int res=n%2;
					 n=n/2;
					 if(res==1) {
					 i++;
				}
				}	 
				}
				return i;
			}


	}
