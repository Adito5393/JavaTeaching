package lectures.java_basics_overview;
public class Factorials {
	static int number;
	static long factorial;
	public static void setNumber(int newValue) {
		number = newValue;
		factorial = loopingFactorial(number);
	}
	public static int getNumber(int newValue) {
		return number;
	}
	
	// what does Eclipse say if you replace the first long with int but do not replace the second one?
	// what does Eclipse say if you replace the second long with int but not replace the first one? 
//	public static int loopingFactorial(int aNumber) {
	public static long loopingFactorial(int aNumber) {
		long aFactorial = 1;
		while (aNumber > 0) {
			aFactorial *= aNumber;
			aNumber -= 1;
		}
//		return (int) aFactorial;
//		MultiMethodPermutations.numPermutations4Choose2 = 0;
		return aFactorial;

	}
	// What happens to the times and results when you replace  long with int?
	// try factorial 16 and 17
	// what does Eclipse say if you delete public or static
	public static long recursingFactorial(int aNumber) {
		// What happens if you delete or comment out the next two lines, which are the
		// base case
		if (aNumber <= 1)
			return 1;
		return aNumber*recursingFactorial(aNumber-1);
	}
	
	public static long getFactorial() {
		return factorial;
	}
	
	public static long factorialAfterNumberIncrement() {
		number++;
		return getFactorial();
	}
	
//
//	public static void setFactorial(int n) {
//		while (n > 0) {
//			product *= n;
//			n -= 1;
//		}
//	}
}
