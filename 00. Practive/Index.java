public class Index {

  public static void fun(int x) {
    if (x > 0) {
      System.out.println(x);
      fun(x - 1);
    }
  }

  public static void main(String[] arg) {

    int x = 5;
    fun(x);

  }
}