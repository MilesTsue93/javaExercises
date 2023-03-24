package chapter_9;

public class Basketball extends Athlete {

  private boolean canDunk;
  private double height;
  private double vertical;
  private int sponsorships;
  private boolean isAllStar;

  public Basketball(int salary, int jerseyNumber, String name, String sport, boolean isArrogant) {
    super(salary, jerseyNumber, name, sport, isArrogant);
    
  }
}
