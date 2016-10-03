package lectures.inheritance.is_a;
/**
 * This is an extra interface we have added, which is not directly implemented by
 * any class
 * Press F4 on the interface Locatable and see type subtypes of this
 * interface
 * 
 * Go to interface PointInheritingFromLocatable
 *
 */
public interface Locatable {
	int getX();
	int getY();
	void setX(int newVal);
	void setY(int newVal);
}
