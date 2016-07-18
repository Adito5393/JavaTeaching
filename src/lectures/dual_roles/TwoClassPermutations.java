package lectures.dual_roles;

import lectures.java_basics_overview.Factorials;

public class TwoClassPermutations {
	// least privilege principle
	//public
	static long numPermutations4Choose2;
	static long numPermutations4Choose3; 
	public static void printNumPermutations(int n, int r, long numPermutations) {
		System.out.println ("N = " + n + " R = " + r + " Permuntations = " + numPermutations4Choose2);
	}

	public static void main (String[] args) {
		// compute n!/(n-r)!
		int n = 4;
		int r = 2;
		long nFactorial = Factorials.loopingFactorial(n);
		
		long nMinusRFactorial = Factorials.loopingFactorial(n-r);
		
		numPermutations4Choose2 = nFactorial/nMinusRFactorial; // 4/(4-2)!
		printNumPermutations(n, r, numPermutations4Choose2);
		// now compute the permutations for 4/(4-3)! to see how permutations grow
		// we do not recompute 4!
		r = 3;
		nMinusRFactorial = Factorials.loopingFactorial(n-r);		
		numPermutations4Choose3 = nFactorial/nMinusRFactorial; // 4/(4-3)!
		printNumPermutations(n, r, numPermutations4Choose3);
	}
}
