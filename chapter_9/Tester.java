package chapter_9;

public class Tester {
  public static void main(String[] args) {
    RoundPrism sphere = new Sphere(7);

    System.out.println();
    double volume = sphere.getVolume();
    System.out.println(volume);
    System.out.println();
    
    double area = sphere.getSurfaceArea();
    System.out.println(area);
    System.out.println();  
  }
}
