public class Index {
  static boolean func(int n) {
    if (n == 0)
      return false;

    return (n & (n - 1)) == 0;
    // return (n != 0) && ((n & (n - 1)) == 0);
  }

  public static void main(String[] arg) {
    // System.out.println(func(16));
    System.out.println(5&4);
  }
}