public abstract class Number{
    public abstract double getValue();
  
    /*return 0 when this Number equals the other RealNumber
    return a negative value when this Number is smaller than the other Number
    return a positive value when this Number is larger than the other Number
    */
    public int compareTo(Number other){
      if (equals(other)){
        return 0;
      }
      
     else if (getValue() > other.getValue()){
        return 1;
      }
      else{
          return -1;
      }
    }
  
    /*
    *Return true when the % difference of the values
    *are within 0.00001 of eachother.
    *Special case: if one is exactly zero, the other must be exactly zero.
    */
    public boolean equals(Number other){
        double x = this.getValue();
        double y = other.getValue();
  
        if (x == 0 || y == 0){
          return (x == y);
        }else{
          return ((Math.abs(x - y)) / Math.abs((x + y)/2) <= 0.00001);
        }
  
      }
  }