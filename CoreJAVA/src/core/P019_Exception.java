package core;

import java.util.InputMismatchException;
import java.util.Scanner;
class Divide{ // B
	public void division() throws ArithmeticException,InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if(b>0) {
			int c = a / b;
			System.out.println(c);
		}
		else {
			throw new ArithmeticException("cannot divide by zero");
		}
	}
}
public class P019_Exception {//A
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("number cannot divide by 0");
		}catch(InputMismatchException e) {
			System.out.println("denominator should be numberic");
		}
		
		
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a / b;
//			System.out.println(c);
//			System.exit(12);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator should be greater than 0");
//		} catch (InputMismatchException e) {
//			System.out.println("denominator should be numberic value");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will executes everytime"); 
//		}
	}
}
