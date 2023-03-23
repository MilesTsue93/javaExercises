package chapter_9;

public class UndergraduateStudent extends Student {
  private int year;

  public UndergraduateStudent(String name) {
    super(name, 18);
    this.year = 0;
  }

  @Override
  public void setAge(int age) {  
    super.setAge(age);
    year++;
  }
}
