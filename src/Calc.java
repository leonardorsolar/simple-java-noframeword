public class Calc {

  // public static int calc(int num1, int num2) {
  // return num1 + num2;
  // }

  public int calc(int num1, int num2) {
    return num1 + num2;
  }

  public static void main(String[] args) {
    // int result = Calc.calc(1, 2);
    Calc result = new Calc();
    int res = result.calc(1, 2);
    System.out.println(res);
  }
}
