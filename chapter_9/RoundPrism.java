package chapter_9;

public abstract class RoundPrism implements Shape {
  
  private double radius;

  public RoundPrism(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  } 

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public abstract double getSurfaceArea();
  public abstract double getVolume();
}
