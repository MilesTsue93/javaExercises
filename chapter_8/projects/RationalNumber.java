public class RationalNumber {

  public RationalNumber (int numerator, int denominator) {
    if (denominator == 0) {
      throw new IllegalArgumentException("denominator cannot be zero");
    }
  }

  public RationalNumber() {
    this.numerator = 0;
    this.denominator = 1;
    this.fraction = 0/1;
  }

  private int numerator;
  private int denominator;
  private int fraction;

  public boolean equals(Object o) {
    if (o.equals(this.fraction)) {
      return true;
    } else {
      return false;
    }
  }

  public int getNumerator() {
    return this.numerator;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  public String toString() {
    if (denominator == 1) {
      return numerator + "";
    }
    return numerator + "/" + denominator;
  }
}