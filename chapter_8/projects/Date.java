public class Date {
  private int year;
  private int month;
  private int week;
  private int day;
  private String date;

  // pre: years are expected to adhere to constraints of calendar

  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.date = year + "/" + month + "/" + day;
  }

  public void addDays(int days) {
    if (this.day + days > 31) {
      this.day = (this.day + days) % 31;
    }
    this.day += days;
  }

  public void addWeeks(int weeks) {
    this.date += weeks * 7;
  }

  public int daysTo(Date other) {
    return Math.abs(other.date - this.date);
  }

  public boolean equals(Object o) {
    if (o.toString)

    }
  }
