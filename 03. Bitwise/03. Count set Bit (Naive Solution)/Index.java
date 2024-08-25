public class Index {

  public static int CountSet(int n) {
    int res = 0;
    while (n > 0) {

      // ? First way of Naive solutoin
      // if((n%2)!=0){
      // res++;
      // }

      // ? 2nd Solution
      // if ((n & 1) == 1) {
      // res++;
      // } 👇

      // ? 3rd soluton
      res = res + (n & 1);
      n = n >> 1;
    }

    return res;
  }

  public static void main(String[] arg) {
    System.out.println(CountSet(13));
  }
}