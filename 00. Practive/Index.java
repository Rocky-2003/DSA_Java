public class Index {

  public static int fun(int x) {
    if (x == 0 || x == 1)
      return x;

    return fun(x - 1) + fun(x - 2);
  }

  public static void main(String[] arg) {

    int x = 3;
    System.out.println(fun(x));

  }
}