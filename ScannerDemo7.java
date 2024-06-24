import java.util.Scanner;

public class ScannerDemo7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("scan the first number:");
		
		int i = sc.nextInt();
		
		System.out.println("scan the second number:");
		int j = sc.nextInt();
		
		System.out.println(i + j);
	}
}
