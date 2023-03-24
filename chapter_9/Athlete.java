package chapter_9;

// commmon abstract superclass of athletes in sports
public abstract class Athlete {
    private int salary;
    private String name;
    private String sport;
    private int jerseyNumber;
    private boolean isArrogant;

    public Athlete(int salary, int jerseyNumber, String name, String sport, boolean isArrogant) {
      this.salary = salary;
      this.name = name;
      this.sport = sport;
      this.jerseyNumber = jerseyNumber;
      isArrogant = true;  // by default, every athlete is arrogant
    }

    public int getSalary() {
      return salary;
    }

    public void setSalary(int salary) {
      this.salary = salary;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }


    // abstract methods common to all sports
    // in sublcasses
    public abstract void changeSport(String sport);
    public abstract void changeNumber(int number);
    public abstract void increaseSalary(int salary);
    public abstract String interviewComments(String question);
}
