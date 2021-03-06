package lectures.graphics.extra;

import lectures.composite.objects_shapes.Point;


public interface AnotherLabel {	
    public Point getLocation(); 
    public void setLocation(Point newVal);
    public int getWidth();
    public void setWidth(int newVal);
    public int getHeight() ;
    public void setHeight(int newVal);
    public String getImageFileName();
    public void setImageFileName(String newVal);
}
