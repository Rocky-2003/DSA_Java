public class Index {

  // Recusion
  public static long func(int x) {
    if (x == 0)
      return 1;

    return x * func(x - 1);

  }

  public static void main(String[] args) {

    int n = 5;
    int fact = 1;
    System.out.println(func(n));

    for (int i = 1; i <= n; i++) {
      fact *= i;
    }

    System.out.println("fact: " + fact);

  }
}