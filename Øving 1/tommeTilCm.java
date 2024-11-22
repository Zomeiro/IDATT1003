public class tommeTilCm {
  
  static double konverter(double tommer){
    double cm = tommer*2.54;
    return cm;
  }
  public static void main(String[] args) {
    double[] numbers = {3,2.2,6,8.9,75};
    for (int e = 0; e < numbers.length; e++) {
      System.out.println(konverter(numbers[e]));
    }
}
}