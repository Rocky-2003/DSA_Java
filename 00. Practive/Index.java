public class Index {

  public static void fun(int x) {
    int n = x;
    int b = 0;
    while (n >= 2) {
      n = n / 2;
      b++;
    }

    if (Math.pow(2, b) == x) {
      System.out.println("Yes");
    } else {
      System.out.println("Nooooo");
    }
  }

  public static void main(String[] arg) {

   fun(16);

  }
}