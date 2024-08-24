public class Index {

  public static int Trail(int n) {
    int fact = 1;
    for (int i = 2; i <= n; i++)
      fact *= i;

    System.out.println(fact);
    int res = 0;
    while (fact > 0) {
      // System.out.println(fact % 10 == 0);
      if (fact % 10 == 0) {
        res++;
        fact = fact / 10;
      } else {
        fact = fact / 10;

      }

    }
    return res;
  }

  public static void main(String[] arg) {
    System.out.println(Trail(7));
  }
}