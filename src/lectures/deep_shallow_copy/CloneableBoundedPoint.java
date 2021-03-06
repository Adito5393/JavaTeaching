package lectures.deep_shallow_copy;

import lectures.inheritance.is_a.extra.BoundedPoint;

public interface CloneableBoundedPoint extends BoundedPoint {
	public Object clone();
	public CloneableBoundedPoint deepCopy();
}
