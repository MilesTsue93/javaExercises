public class Date {
  private int year;
  private int month;
  private int day;

  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public void addDays(int days) {
    if (this.day + days > 31) {
      this.day = (this.day + days) % 31;
    }
    this.day += days;

  }
}
