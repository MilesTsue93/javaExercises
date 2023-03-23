package chapter_9;

public class Sphere extends RoundPrism {
  
  public Sphere(double radius) {
    super(radius);
  }

  public double getSurfaceArea() {
    return Math.PI * getRadius() * getRadius();
  }

  public double getVolume() {
    return (4/3) * Math.PI * getRadius() * getRadius() * getRadius();
  }
}
