public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0); //this value is ignored! 
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else{
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue(){
    return (double)numerator/denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return (numerator == other.getNumerator() && denominator == other.getDenominator());
  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return "" + numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    // http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    int hold;
    if (b > a){
      hold = b;
      b = a;
      a = hold;
    }
    while (a % b != 0){
      hold = a % b;
      a = b;
      b = hold;
    } 
    return b;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){

    
    if (numerator == 0){
      denominator = 1;
    }
    else if(numerator == denominator){
      numerator = 1;
      denominator = 1;
    }
    else{
      int myGcd = gcd(numerator, denominator);
      numerator /= myGcd;
      denominator /= myGcd;
    }
    if (denominator * numerator < 0){
      numerator = -1 * Math.abs(numerator);
      denominator = Math.abs(denominator);
    }else if(denominator < 0 && numerator < 0){
      numerator = Math.abs(numerator);
      denominator = Math.abs(denominator);
    }
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    
    return new RationalNumber(numerator * other.getDenominator() + denominator * other.getNumerator(), denominator * other.getDenominator());
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator() - denominator * other.getNumerator(), denominator * other.getDenominator());
  }
} 