package lectures.casting_vs_conversion;

import lectures.composite.objects_shapes.ACartesianPoint;
import lectures.extra.AConvertiblePolarPoint;

public class AConvertibleCartesianPoint extends ACartesianPoint implements ConvertiblePoint {
	public AConvertibleCartesianPoint(int theX, int theY) {
		super (theX, theY);
	}	
	public ConvertiblePoint asCartesianPoint() {
		return this; // could also clone
	}
	public ConvertiblePoint asPolarPoint() {
		return new AConvertiblePolarPoint(getRadius(), getAngle());		
	}
	
	public static void main(String args[]) {
		ConvertiblePoint point =  new AConvertibleCartesianPoint (50, 100);
		point = (AConvertiblePolarPoint) point.asPolarPoint();		
	}
}
