package chapter_9;


// this class works for cubes too, so
// no need to make extra cube class
public class Prism implements Shape {
  
  private double width;
  private double length;
  private double height;
  
  public Prism(double width, double length, double height) {
    this.width = width;
    this.length = length;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  // returns surface area of a rectagular prism
  public double getSurfaceArea() {
    return 2 * ((getWidth() * getHeight()) + (getWidth() * getHeight()) + (getWidth() * getHeight()));
  }

  // returns volume of a prism
  public double getVolume() {
    return getWidth() * getHeight() * getHeight();
  }
}
