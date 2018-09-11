/**
 * 
 */
package Learning;

import java.util.Scanner;

/**
 * @author Karthic
 *
 */
public class Student {

	/**
	 * @param args
	 */
	static String a;
	static int b,c,d, e,f,g;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ENTER THE STUDENT NAME = ");
		
		Scanner scanner = new Scanner (System.in);
		
		a = scanner.next();
		System.out.println("Enter the mark1 =  ");
		b = scanner.nextInt();
		System.out.println("Enter the mark2 =  ");
		c = scanner.nextInt();
		System.out.println("Enter the mark3 =  ");
		d = scanner.nextInt();
		
		f=b+c+d;
		g=f/3;
		System.out.println("1.result");
		System.out.println("2.Total");
		System.out.println("3.Average");
		System.out.print("choose any one = ");
		e=scanner.nextInt();
		
		switch(e){
		case 1 :
			
			varifyStatus();
			
			break;
		case 2 :
			System.out.println(a +" total is = "+f);
			break;
		case 3 :
			System.out.println(a +" average is = "+g);
			break;
		}
	
	}
	static void varifyStatus(){

			if(b>=35 && c>=35 && d>=40){
				System.out.println(a +" is pass");
				
			}else{
				System.out.println(a +" is Fail");
			}
	 }

}
