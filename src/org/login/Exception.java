package org.login;

import jdk.vm.ci.code.site.ExceptionHandler;

public class Exception {
	public static void main(String[] args) {
		
		try {
			System.out.println(4/0);
			
		}
		
		
		catch (NullPointerException e) {
			System.out.println("dont dive the value");
		}
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("don't dived the value");
		
		}
		
		catch (IndexOutOfBoundsException e) {
			System.out.println("dont dive the value ");
		}
		
		catch (ArithmeticException e) {
			System.out.println("dont dive the value ");
		}
		
		
		finally {
			System.out.println("fianally statement");
		}
			
			
			
		
		
		
	}
	
	
}

	


