public class Index {
  public static int countSet(int n) {
    int res = 0;

    while (n > 0) {
      n = n & (n - 1);
      res++;
    }

    return res;
  }

  public static void main(String[] arg) {
    System.out.println(countSet(13));
  }
}