package lectures.generics_adapters;

import java.util.Arrays;

import lectures.composite.objects_shapes.ACartesianPoint;
import lectures.composite.objects_shapes.Point;
/**
 * This class illustrates the use of generics.
 * 
 * A generic is a class or interface that takes one or more "type"
 * parameters when it is both declared and used.
 * 
 * These parameters are enclosed in angle brackets.
 * 
 * Here we see the use of generics.
 * 
 * When we supply parameters to a generic (class or interface), we
 * can say that we "elaborate" it. It is as if we are saying, "Not
 * only is this object of type AHistory, it is of an AHistory that
 * stores Points"
 *  
 * 
 * Look at the code.
 * 
 * 
 * Answer questions below.
 */
public class GenericHistoryUser {

	public static void manipulatePoints() {
		/*
		 * Below we elaborate the generic History interface with type parameter Point,
		 * and the generic class AHistory with the parameter Point.
		 */
		History<Point> aPointHistory = new AHistory<Point>();
//		printClassInterfacesAndMethods(aPointHistory);
		aPointHistory.addElement(new ACartesianPoint(0, 1));
		System.out.println (((Point)aPointHistory.elementAt(0)).getX());
	}
	
	public static void manipulateStrings() {
		History<String> aStringHistory = new AHistory<String>();	
//		printClassInterfacesAndMethods(aStringHistory);		
		
		/*
		 * Swap the two addElements when asked
		 */
		aStringHistory.addElement("hello");		
//		aStringHistory.addElement(new ACartesianPoint(0, 1));
		
		/*
		 * Swap the two printlns when asked
		 */
		System.out.println (((String)aStringHistory.elementAt(0)).charAt(0));
//		System.out.println (aStringHistory.elementAt(0).charAt(0));
	}
	
	public static void printClassInterfacesAndMethods (Object anObject) {
		System.out.println (anObject + "\n" +
				" Class: " + anObject.getClass() + "\n" + 
				" interfaces:" + Arrays.asList(anObject.getClass().getInterfaces()) + "\n" +
				Arrays.asList(anObject.getClass().getDeclaredMethods()));
		
	}
	
	public static void main (String[] args) {
		manipulatePoints();
		manipulateStrings();		
	}	
}

/*
 * PART 1:
 * 
 * (T/F) An instance of AHistory can have String elements.
 * 
 * (T/F) AHistory can be instantiated to create a history of any type of
 * element.
 * 
 * In manipulateStrings() swap the two addElement() calls, and run it if there
 * are no compile errors.
 * 
 * Swapping the two addElement() calls in GenericHistoryUser results in:
 *   (a) a compile error.
 *   (b) a runtime error.
 *   (c) none of the above.
 * 
 * Next, in manipulateStrings() swap the two println() calls, and run if there
 * are no compile errors.
 * 
 * Swapping the two println() calls calls in GenericHistoryUser results in: 
 *   (a) a compile error.
 *   (b) a runtime error.
 *   (c) none of the above.
 * 
 * (T/F) String elements of AHistory<String> must be cast to String if String operations
 * are to be executed on them.
 * 
 * Recall that AStringHistory was a history with String elements.
 * 
 * (T/F) AHistory (with its elaborations) is more versatile than AStringHistory - it can be used
 * to create more kinds of histories and thus used in a greater variety of applications.
 * 
 * (T/F) AHistory (with its elaborations) is less safe than AStringHistory - it can lead to 
 * class cast exceptions when elements are to be manipulated in different applications.
 * 
 * Next, visit: History and AHistory
 * 
 * After you return here, answer the question in part 2.
 */

/*
 * PART 2:
 * 
 * Uncomment the two calls to printClassAndInterfaces.
 * 
 * Run the program to see the class and interface of aPointHistory and aStringHistory
 * 
 * When a a generic defining a formal type parameter F is elaborated with an actual 
 * parameter A (such as String):
 * 	(a) Java creates a new class in which all occurrences of F are replaced with A.
 * 	(b) Java uses a single class in which all occurrences of F are replaced with Object. 
 *  
 * 
 * Next class AGenericConsoleView
 */
