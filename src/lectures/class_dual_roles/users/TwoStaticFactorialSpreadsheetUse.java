package lectures.class_dual_roles.users;

import lectures.class_dual_roles.statics.Factorials;
import lectures.class_dual_roles.statics.StaticLoopingFactorialSpreadsheet;
import lectures.class_dual_roles.statics.extra.AnotherStaticLoopingFactorialSpreadsheet;

public class TwoStaticFactorialSpreadsheetUse {
	
	public static void main (String[] args) {
		StaticLoopingFactorialSpreadsheet.setNumber(4);		
		System.out.println("The square of 4 factorial is:" + StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		
		AnotherStaticLoopingFactorialSpreadsheet.setNumber(2);
		/**
		 * 
		 * We are using a different class now - AnotherStaticLoopingFactorialSpreadsheet.
		 * Have a quick look at it to confirm it is a copy of the 
		 *  StaticLoopingFactorialSpreadsheet.
		 *  As usual, click on the class name below and click F3 to see the code.
		 *  Press ALT <- to return back to this method
		*/
		System.out.println("The square of 2 factorial is:" + AnotherStaticLoopingFactorialSpreadsheet.getFactorial() 
				* AnotherStaticLoopingFactorialSpreadsheet.getFactorial());
		/**
		 * 		 
		 * We can now access 4! and 2! simultaneously without storing them in local variables
		 * or recomputing the factorials.
		*/
		System.out.println ("4!/2! is: " + StaticLoopingFactorialSpreadsheet.getFactorial()/AnotherStaticLoopingFactorialSpreadsheet.getFactorial());
		/**
		 * 		
		 * This is a copy and paste, solution - ugh!
		 * What if we want an arbitrary number of store factorials, not known before we start the program
		 * Go to lectures.class_dual_roles.instances.package-info.java to see the solution after you have processed
		 * the instructions in the classes referenced in lectures.class_dual_roles.statics.package-info.java 
		 * 
		 * 
		 */		
	}
}


