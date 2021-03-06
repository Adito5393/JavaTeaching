package lectures.exceptions.extra;

import java.util.NoSuchElementException;

import lectures.iterator.IteratedStringPrinter;
import lectures.iterator.StringIterator;

public class AnArrayIteratorThrowingUncheckedException implements StringIterator {
	String[] elements;
	int nextIndex;
	public AnArrayIteratorThrowingUncheckedException(String[] anElementArray) {
		elements = anElementArray;		
	}
	public String next() throws NoSuchElementException {
		if (!hasNext())
			throw new NoSuchElementException();
		String retVal = elements[nextIndex];
		nextIndex++;
		return retVal;
	}
	public boolean hasNext() {
		return nextIndex < elements.length;
	}
	public static void main(String[] args) {
		IteratedStringPrinter.print(new AnArrayIteratorThrowingUncheckedException(new String[]{"hello", "goodbye"}));	
	}

}
