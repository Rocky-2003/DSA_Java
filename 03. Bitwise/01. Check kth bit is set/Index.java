public class Index {

  public static void check(int n, int k) {


    if ((n & (1 << (k - 1))) != 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }


  }

  public static void main(String[] arg) {
    check(5, 1);
  }

}