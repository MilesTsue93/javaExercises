public class RationalNumber {

public static void main(String[] args) {
  RationalNumber frac = new RationalNumber(5, 6);
  RationalNumber frac2 = new RationalNumber(5, 6);
  RationalNumber frac3 = new RationalNumber(4,6);
  RationalNumber frac4 = new RationalNumber();
  
  System.out.println(frac.toString());
  System.out.println(frac.equals(frac2)); // should be true
  System.out.println(frac.equals(frac3));  // should be false
  System.out.println(frac4.toString());  // should return 0/1
  System.out.println();
  System.out.println(frac3.getNumerator());  // should return 4
}

  public RationalNumber(int num, int den) {
    if (den == 0) {
      throw new IllegalArgumentException("denominator cannot be zero");
    }
    this.numerator = num;
    this.denominator = den;
    this.fraction = num + "/" + den;
  }

  public RationalNumber() {
    this.numerator = 0;
    this.denominator = 1;
    this.fraction = "0/1";
  }

  private int numerator;
  private int denominator;
  private String fraction;

  public boolean equals(Object o) {
    if (o.toString().equals(this.fraction)) {
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
    if (this.denominator == 1) {
      return this.numerator + "";
    }
    return this.fraction;
  }
}