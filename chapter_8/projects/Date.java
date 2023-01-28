public class Date {
  private int year;
  private int month;
  private int week;
  private int day;
  private int date;

  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.date = year * 365 + month * 30 + week * 7 + day; 
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
